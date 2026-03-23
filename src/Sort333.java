import java.util.Scanner;
import java.util.*;
public class Sort333 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            //Selection Sort
          System.out.println("Enter the size of the arrays");
          int n=sc.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
            }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i < n - 1) {
                System.out.print("->");
            }
        }

    }
    }

