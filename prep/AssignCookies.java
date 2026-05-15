package prep;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String []args){
        int g[]={1,2,3};
        int s[]={1,1};
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int count=0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(count);
    }
}
