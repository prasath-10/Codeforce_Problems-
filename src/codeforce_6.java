import java.util.*;
public class codeforce_6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        int start=0;
        int end=b1.length -1;
        if(a1.length!=b1.length)
        {
            System.out.println("NO");
            return;
        }
        while(start <a1.length && end >=0){
            if(a1[start]!=b1[end]){
                System.out.println("NO");
                return;
            }
            start++;
            end--;
        }
        System.out.println("YES");


    }
}
