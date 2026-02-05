import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        System.out.println(q);
        q.remove();
        System.out.println(q);
        if(q.isEmpty()){
            System.out.println("Queue is empty");
        }
        else if(!q.isEmpty()){
            System.out.println("Queue is not empty");
        }

    }
}
