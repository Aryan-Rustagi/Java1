import java .util.Scanner;
import java.util.*;
import  java.io.*;
public class Sort4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Selection Sort
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minindex]>arr[j]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");}

    }

}
