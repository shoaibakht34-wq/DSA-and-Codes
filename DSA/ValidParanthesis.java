package DSA;
import java.util.Stack;
public class ValidParanthesis {
    public static void main(String[] args) {
        String s="({[]]})";
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        if(n%2!=0){
            System.out.println("Not valid");
        }
        char top=stack.peek();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==')'&&top!='('){
                System.out.println("Not valid");
            }
              else if(ch=='}'&& top!='{'){
                System.out.println("Not valid");
              }   
            else if(ch==']'&& top!='['){
                System.out.println("Not valid");
            }
            else{
                stack.push(ch);            
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
    }

}