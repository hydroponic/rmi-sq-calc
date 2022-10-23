package com.company;
import java.io.Serializable;
import static java.sql.Types.NULL;
public class Answer implements Serializable {
    private static final long Serialization = 1L;
    private double a,b;
    private String c;
    Answer(double a, double b) {
        this.a = a;this.b = b;System.out.println(a + ", " + b);
        this.c="";
    }
    Answer(double a) {
        this.a = a;System.out.println(a);
        this.b=NULL;
        this.c="";
    }
    Answer(String c) {
        this.c = c;System.out.println(c);
    }
    public void printAns() {
        if (this.c!="")
            System.out.println(this.c);
        else if (this.b==NULL) System.out.println(a);
        else System.out.println(this.a+", "+this.b);
    }
}
