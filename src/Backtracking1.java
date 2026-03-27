import java.util.Scanner;

class Solution {
    public static int printpermutations(String str, String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return 1; // 1 permutation found
        }

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            count += printpermutations(newstr, perm + currchar);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int total = printpermutations(input, "");

        System.out.println("Total permutations = " + total);

        sc.close();
    }
}