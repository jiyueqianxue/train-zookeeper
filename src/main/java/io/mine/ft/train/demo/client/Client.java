package io.mine.ft.train.demo.client;
 
import io.mine.ft.train.demo.common.HelloService;
 
public class Client {
 
    public static void main(String[] args) throws Exception {
        ServiceConsumer consumer = new ServiceConsumer();
        // zookeeper测试
        while (true) {
            HelloService helloService = consumer.lookup();
            String result = helloService.sayHello("Jack");
            System.out.println(result);
            Thread.sleep(3000);
        }
    }
}