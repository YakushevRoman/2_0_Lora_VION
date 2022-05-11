@echo off 

MD .\temp
MD .\temp\forpost_server_java
MD .\temp\forpost_server_kotlin

protoc.exe --javaapi_out=.\temp\forpost_server_java forpost.proto forpost_server.proto tagger.proto additional_device.proto runtime_dbg.proto stress_belt.proto esp_srv.proto firmware.proto BombPro.proto base.proto
if errorlevel 1 goto :proto_error

protoc.exe --java_out=.\temp\forpost_server_java forpost.proto forpost_server.proto tagger.proto additional_device.proto runtime_dbg.proto firmware.proto esp_srv.proto stress_belt.proto BombPro.proto base.proto
if errorlevel 1 goto :proto_error

protoc.exe --kotlin_out=.\temp\forpost_server_kotlin forpost.proto forpost_server.proto tagger.proto additional_device.proto runtime_dbg.proto firmware.proto esp_srv.proto stress_belt.proto BombPro.proto base.proto
if errorlevel 1 goto :proto_error

if exist .\res (
	RD /s/q .\res
)
rename temp res

goto :eof

:proto_error
RD /s/q .\temp
echo ************************************************************************
echo *                       ERROR   !!!!!                                  *
echo *  forpost proto FAILED.  please fix errors listed above and try again * 
echo *                                                                      *
echo ************************************************************************
pause