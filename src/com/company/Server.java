package com.company;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import com.company.CalcServiceImpl;
import com.company.ICalcService;

public class Server {

    public static final String SERVICE_NAME = "calc";

    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        ICalcService service = new CalcServiceImpl();
        Remote stub = UnicastRemoteObject.exportObject(service, 0);
        Registry registry = LocateRegistry.createRegistry(1888);
        registry.rebind(SERVICE_NAME, stub);
        System.out.println("calc service binded");
    }
}
