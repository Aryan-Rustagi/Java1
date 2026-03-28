import java.util.Scanner;

public class RecursionMathPow{

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
         return x*power(x,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number ");
        int x=sc.nextInt();
        System.out.println("Enter the exponential number ");
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }
}
