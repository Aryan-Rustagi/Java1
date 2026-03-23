import java.util.Scanner;
import java.util.Stack;

public class StacksandQueues {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        System.out.println(s);
    }
}
