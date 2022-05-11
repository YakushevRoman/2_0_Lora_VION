@echo off 

MD .\temp
MD .\temp\forpost_server
MD .\temp\forpost_server_java
MD .\temp\forpost_server_delphi
MD .\temp\cpp_server
MD .\temp\tagger
MD .\temp\tagger_esp
MD .\temp\additional_device
MD .\temp\vest_proto
MD .\temp\vest_3_0
MD .\temp\military
MD .\temp\military_java

protoc.exe --delphi_out=srv,cfg=config_delphi.srv.ini:.\temp\forpost_server_delphi tagger.proto forpost_server.proto additional_device.proto runtime_dbg.proto esp.proto filesystem.proto firmware.proto stress_belt.proto
if errorlevel 1 goto :proto_error

protoc.exe --javaapi_out=.\temp\forpost_server_java forpost.proto forpost_server.proto tagger.proto additional_device.proto runtime_dbg.proto stress_belt.proto esp_srv.proto firmware.proto
if errorlevel 1 goto :proto_error

protoc.exe --java_out=.\temp\forpost_server_java forpost.proto forpost_server.proto tagger.proto additional_device.proto runtime_dbg.proto firmware.proto esp_srv.proto stress_belt.proto
if errorlevel 1 goto :proto_error

protoc.exe --stm_out=cpp,srv,cfg=config_cpp.srv.ini:.\temp\cpp_server forpost_server.proto tagger.proto filesystem.proto additional_device.proto runtime_dbg.proto firmware.proto esp_srv.proto stress_belt.proto
if errorlevel 1 goto :proto_error

protoc.exe --stm_out=,cfg=config_tag.ini:.\temp\tagger forpost_server.proto tagger.proto filesystem.proto runtime_dbg.proto firmware.proto stress_belt.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=noweak,txt:.\temp\tagger esp.proto
if errorlevel 1 goto :proto_error

protoc.exe --stm_out=noweak,srv,txt:.\temp\tagger_esp esp.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=noweak,txt:.\temp\tagger_esp esp_srv.proto
if errorlevel 1 goto :proto_error

protoc.exe --stm_out=srv,cfg=config_tag2vest.ini:.\temp\tagger vest_rs485.proto runtime_dbg.proto
if errorlevel 1 goto :proto_error

protoc.exe --stm_out=,cfg=config_vest.ini:.\temp\vest_3_0 vest_rs485.proto runtime_dbg.proto filesystem.proto firmware.proto vest_setting.proto
if errorlevel 1 goto :proto_error

rem Mil config_additional_device

copy military.proto\Common_military.proto Common_military.proto
copy military.proto\PTRK_military.proto PTRK_military.proto
copy military.proto\Kit_military.proto Kit_military.proto
copy military.proto\Cart_military.proto Cart_military.proto
copy military.proto\Target_military.proto Target_military.proto
copy military.proto\Panzer_military.proto Panzer_military.proto
copy military.proto\Rs_military.proto Rs_military.proto

protoc.exe --stm_out=.\temp\military Common_military.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=.\temp\military PTRK_military.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=.\temp\military Cart_military.proto 
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=.\temp\military Kit_military.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=.\temp\military Target_military.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=.\temp\military Panzer_military.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=noweak,txt:.\temp\military esp.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=.\temp\military Rs_military.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=srv:.\temp\military Rs_military.proto
if errorlevel 1 goto :proto_error


protoc.exe --stm_out=,cfg=config_additional_device.ini:.\temp\additional_device forpost_server.proto additional_device.proto filesystem.proto firmware.proto
if errorlevel 1 goto :proto_error
protoc.exe --stm_out=noweak,txt:.\temp\additional_device esp.proto
if errorlevel 1 goto :proto_error

protoc.exe --java_out=.\temp\military_java Common_military.proto PTRK_military.proto Kit_military.proto Cart_military.proto Target_military.proto Panzer_military.proto
if errorlevel 1 goto :proto_error

protoc.exe --javaapi_out=.\temp\military_java Common_military.proto PTRK_military.proto Kit_military.proto Cart_military.proto Target_military.proto Panzer_military.proto
if errorlevel 1 goto :proto_error


del Common_military.proto
del PTRK_military.proto
del Cart_military.proto
del Kit_military.proto
del Target_military.proto
del Panzer_military.proto
del Rs_military.proto

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