package DSA;
//find longest substring without repating characters by using window sliding technique
public class HasSubString1 {
    public static void main(String[]args){
        String s="geeksforgeeks";
        int i=0 ,j=0, maxlen=1;
        while(j<s.length()){
            char ch=s.charAt(j);
            int index=s.indexOf(ch, i);
            if(index==-1 || index>=j){
                j++;
            }
            else{
                int len=j-i;
                maxlen=Math.max(maxlen, len);
                i=index+1;
                j++;
            }
        }
        System.out.println(maxlen);
    }
}
