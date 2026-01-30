import java.util.*;
public class codeforce4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Long a=scan.nextLong();
        int sum=0;
        if(a%2==0)
        {
            System.out.println(a/2);
        }
        else{
            System.out.println(-(a+1)/2);
        }


    }
}
