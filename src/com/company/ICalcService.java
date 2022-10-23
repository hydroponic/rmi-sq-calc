package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalcService extends Remote {
    Answer ans(int a, int b, int c) throws RemoteException;
}
