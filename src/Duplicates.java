//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.Scanner;
public class Duplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the number in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
