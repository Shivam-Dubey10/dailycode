package com.company;

import java.util.Scanner;

public class Main {
    public int codeCount(int a){
        int count=1;
        int b=0;
        while(a>10){
            b=a%100;
            a=a/10;
            if(b>0 && b<=26){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        Main m = new Main();
        int b = m.codeCount(a);
        System.out.println(b);
    }
}
