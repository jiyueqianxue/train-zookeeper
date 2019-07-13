package io.mine.ft.train.demo.server;
 
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import io.mine.ft.train.demo.common.HelloService;
 
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected HelloServiceImpl() throws RemoteException {
    }
 
    @Override
    public String sayHello(String name) throws RemoteException {
        return String.format("Hello %s", name);
    }
}