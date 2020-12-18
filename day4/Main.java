package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public int funtion(int[] arr){
        ArrayList<Integer> arr1 =  new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr1.add(arr[i]);
            }
        }
        if(arr1.size()>=1){
            int max=arr1.get(0);
            for(int i=1;i<arr1.size();i++){
                if(arr1.get(i)>max){
                    max=arr1.get(i);
                }
            }
            int a=0;
            for(int i=1;i<max;i++){
                if(arr1.contains(i)){
                    a=max+1;
                }
                else{
                    a=i;
                    break;
                }
            }
            return a;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Main m = new Main();
        int b=m.funtion(arr);
        System.out.println(b);
    }
}
//Time complexity = O(n)
