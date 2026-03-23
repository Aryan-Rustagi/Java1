import java.util.Scanner;
public class DigitCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'){
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
