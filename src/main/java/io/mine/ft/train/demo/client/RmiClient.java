package io.mine.ft.train.demo.client;
 
import java.rmi.Naming;

import io.mine.ft.train.demo.common.HelloService;
 
public class RmiClient {
 
    public static void main(String[] args) throws Exception {
        String url = "rmi://localhost:1099/demo.zookeeper.remoting.server.HelloServiceImpl";
        HelloService helloService = (HelloService) Naming.lookup(url);
        String result = helloService.sayHello("Jack");
        System.out.println(result);
    }
}