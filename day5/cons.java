package com.company;

import java.util.Scanner;

public class cons {
    int a;
    int b;
    public cons(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int car(){
        return a;
    }
    public int cdr(){
        return b;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        cons c = new cons(a,b);
        System.out.println(c.car());
        System.out.println(c.cdr());
    }
}
