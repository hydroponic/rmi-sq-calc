package com.company;

public class CalcServiceImpl implements ICalcService {
    public Answer ans(int a, int b, int c) {
        double d = b*b-4*a*c;
        if (d==0) return new Answer(-b/(2*a));
        else if (d> 0) return new Answer((-b+Math.sqrt(d))/(2*a), (-b-Math.sqrt(d))/(2*a));
        else return new Answer("error");
    }
}
