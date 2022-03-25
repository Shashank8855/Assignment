package com.company;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //to take input from user
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter elements in an array:");
        for(int a=0;a<arr.length;a++){
            arr[a]=sc.nextInt();
        }
        //logic to reverse the string
        System.out.println("After reversing array:");
        for(int a=arr.length-1;a>=0;a--){
            //decrement the value and checkout the length
            System.out.println(arr[a]);
        }
    }

}
