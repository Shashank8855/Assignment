package com.company;
import java.util.Scanner;

public class MinMaxArray {

    public static void main(String[] args) {
        //to take input from the user
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        System.out.println("Enter elements in array:");
        int min=Integer.MAX_VALUE;// takes the
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=9;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]<min)
                {
                    min=arr[i];
                }
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            System.out.println("Maximum element from the array is"+max);
            System.out.println("Minimum element from the array is "+min);
    }
}





