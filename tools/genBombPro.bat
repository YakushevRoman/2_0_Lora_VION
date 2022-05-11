@echo off 

MD .\temp
MD .\temp\BombPro


protoc.exe --stm_out=:.\temp\BombPro BombPro.proto base.proto firmware.proto filesystem.proto^
                              forpost_server.proto           
                       
if errorlevel 1 goto :proto_error

protoc.exe --stm_out=txt:.\temp\BombPro esp.proto
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

:proto_error2
RD /s/q .\temp
echo ************************************************************************
echo *                       ERROR 2  !!!!!                                  *
echo *  forpost proto FAILED.  please fix errors listed above and try again * 
echo *                                                                      *
echo ************************************************************************
pause

