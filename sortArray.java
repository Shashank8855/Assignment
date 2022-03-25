package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        //take input from user
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];// declaring size of array upto 10 elements
        System.out.println("Enter elements in an array to be sorted:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        //sorting the array
        System.out.println("After sorting the elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);//printing the output
        }
    }
}
