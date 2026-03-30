import java.util.Scanner;

public class recusionsumn {

    public static long sumn(long n){
        if(n == 0){
            return 0;
        }
        return n + sumn(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();   // ✅ fixed
        System.out.println(sumn(n));
    }
}