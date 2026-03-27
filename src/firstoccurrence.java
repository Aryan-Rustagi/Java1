import java.util.Scanner;

public class firstoccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String word = sc.nextLine();

        int n = str.length();
        int m = word.length();

        for(int i = 0; i <= n - m; i++){

            int j = 0;

            // compare characters
            while(j < m && str.charAt(i + j) == word.charAt(j)){
                j++;
            }

            // full word matched
            if(j == m){
                // print before + after (skip word)
                System.out.println(str.substring(0, i) + str.substring(i + m));
                return;
            }
        }

        // if word not found
        System.out.println(str);
    }
}