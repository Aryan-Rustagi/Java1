// import java.util.Stacks; // invalid import
import java.util.*;

public class ValidParanthesis{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();

    Stack<Character> sh=new Stack<>();
    boolean isValid=true;

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

        if(ch== '('){
            sh.push(')');
        }
        else if(ch =='{'){
            sh.push('}');
        }
        else if(ch == '['){
            sh.push(']');
        }
        else if(ch == ')' || ch == '}' || ch == ']'){
            if(sh.isEmpty() || sh.pop() != ch){
                isValid = false;
                break;
            }
        }
    }
    if(!sh.isEmpty()){
        isValid=false;
    }
    if(isValid){
        System.out.println("Valid Paranthesis");
    }
    else{
        System.out.println("Invalid Paranthesis");
    }

    sc.close();
}
}