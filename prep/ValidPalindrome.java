package prep;

public class ValidPalindrome {
   public static void main(String []args){
    String s="A man , a plan, a canal: Panama";
    s=s.toLowerCase();
    int left=0;
    int rigth=s.length()-1;
    while(left<rigth){
        if(!Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        else if(!Character.isLetterOrDigit(s.charAt(rigth))){
            rigth--;
        }
        else if(s.charAt(left)!=s.charAt(rigth)){
            System.out.println("Not Palindrome");
            return;
        }
        else{
            left++;
            rigth--;
        }
    }
    System.out.println("Palindrome");
   } 
}
