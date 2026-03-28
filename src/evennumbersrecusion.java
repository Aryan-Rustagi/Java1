import java.util.Scanner;
public class evennumbersrecusion {

    public static void evenprint(int n) {
        if (n == 0) {
            return;
        }
        evenprint(n - 1);
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        evenprint(n);

    }
}
