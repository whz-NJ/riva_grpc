[参考](https://blog.huati365.com/6a55affa5c009758)  
protoc.exe --java_out=./ *.proto  #生成通信VO类  
protoc.exe --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java-0.13.2-windows-x86_64.exe --grpc-java_out=./ *.proto  #生成GRPC通信代码
