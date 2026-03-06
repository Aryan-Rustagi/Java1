import java.util.Scanner;
public class Basics {
    public static void main(String[] args){
     Scanner basic = new Scanner(System.in);
     System.out.println("Enter your number: ");
     String str = basic.nextLine();
     int var = basic.nextInt();
     System.out.println("You entered: "+str+var);

    }
}
