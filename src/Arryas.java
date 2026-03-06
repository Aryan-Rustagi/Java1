import java.util.Scanner;
import java.util.Arrays;
public class Arryas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]*arr[i]+"  ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}