import java.util.Stack;
import java.util.*;
import java.util.Scanner;

public class Stacks {
    public static void main(String[] args){
        Stack <Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a Stack");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        System.out.println(s);


    }
}
