package com.company;

import java.util.Scanner;

public class Main {
    public int[] multiplication(int[] arr){
        int n = arr.length;
        int mul = 1;
        int mul1 = 1;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=mul;
            mul=mul*arr[i];
        }
        for(int i=n-1;i>=0;i--){
            arr2[i]=mul1;
            mul1=mul1*arr[i];
        }
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i]*arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Main m = new Main();
        int[] arr1 = m.multiplication(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
    }
}
// Time Complexity = O(n)
