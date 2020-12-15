package com.company;

import java.util.ArrayList;

public class Solution {
    public boolean numberPair(int[] arr, int k){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        boolean contains = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k){
                contains = arr1.contains(arr[i]);
                if(contains){
                        break;
                }
                arr1.add(k-arr[i]);
            }
        }
        return contains;
    }
}
