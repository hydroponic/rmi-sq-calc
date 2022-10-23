package com.company;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.ICalcService;
public class Client {

    public static final String SERVICE_NAME = "calc";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1888);
        Remote stub = registry.lookup(SERVICE_NAME);
        ICalcService service = (ICalcService) stub;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Введите a,b,c: ");
        for (int i = 0; i<3; i++)
            a.add(scanner.nextInt());
        Answer answer = service.ans(a.get(0), a.get(1),a.get(2));
        answer.printAns();
    }
}
