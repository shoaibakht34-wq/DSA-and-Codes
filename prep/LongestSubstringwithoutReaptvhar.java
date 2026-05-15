package prep;

public class LongestSubstringwithoutReaptvhar {
    public static void main(String []args){
        String s="abcabcbb";
        int n=s.length();
        int left=0;
        int right=0;
        int maxLen=0;
        int count[]=new int[128];
        while(right<n){
            char r=s.charAt(right);
            count[r]++;
            while(count[r]>1){
                char l=s.charAt(left);
                count[l]--;
                left++;
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        System.out.println(maxLen);
    }
}
