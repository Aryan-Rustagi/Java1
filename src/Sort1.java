import java.util.Scanner;
public class Sort1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr1[minindex]>arr1[j]);
                minindex=j;
            }
            int temp=arr[minindex];
            arr1[minindex]=arr1[i];
            arr1[i]=temp;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}

