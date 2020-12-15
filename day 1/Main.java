package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner s =  new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Solution sl = new Solution();
        boolean c = sl.numberPair(arr,k);
        System.out.println(c);
    }


}
