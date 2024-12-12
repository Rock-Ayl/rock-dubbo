# dubbo

## 简介

一个` spring + dubbo + nacos `的 demo .

目的:只需要启动 nacos 单机,即可轻松入门` spring + dubbo + nacos `.

## 步骤

1. 本地启动 nacos ,单机的就行,如果是默认配置就不需要修改配置文件.
2. 同时启动 `UserApplication.class` & `UserApplication.class`
3. 调用接口 `Get http://127.0.0.1:9091/product/getUserData`,执行远程的调用
4. 自己看代码,代码不多,全是注释.