import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
public class Queue2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        q.remove();
        System.out.println(q);
    }
}
