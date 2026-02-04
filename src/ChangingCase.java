import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class ChangingCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value");
        String str = sc.nextLine();//here I have taken input from the user
        int n = str.length();
        //here is also a very simple way to convert String to a character array that is char[] arr=str.toCharArray();but well use here manual ways
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(arr[i])){
                arr[i]=Character.toLowerCase(arr[i]);
            }
            else if(Character.isLowerCase(arr[i])){
                arr[i]=Character.toUpperCase(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
