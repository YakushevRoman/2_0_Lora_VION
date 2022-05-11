@echo off 

MD .\temp
MD .\temp\forpost_server_java_tvout
MD .\temp\forpost_delphi_tvout

protoc.exe --javaapi_out=.\temp\forpost_server_java_tvout tvout.proto
if errorlevel 1 goto :proto_error

protoc.exe --java_out=.\temp\forpost_server_java_tvout tvout.proto
if errorlevel 1 goto :proto_error

protoc.exe --delphi_out=srv:.\temp\forpost_delphi_tvout tvout.proto
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
rem pause