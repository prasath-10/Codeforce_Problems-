import java.util.*;
public class codeforce1 {
    public static void main(String[] Args){
        Scanner sc=new Scanner (System.in);
        int  a=sc.nextInt();
        String s=sc.next();
        int count=0;
        for(int i=0;i<a-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                count++;
            }
        }
        System.out.println(count);


    }
}
