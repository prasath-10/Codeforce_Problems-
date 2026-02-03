
import java.util.*;
public class codeforce_10 {
    public static int hcf(int c,int d){
        while(d!=0){
            int temp=d;
            d=c%d;
            c=temp;
        }
        return c;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=hcf(a,b);
        int lcm=(a*b)/hcf;
        System.out.println("the lcm  and hcf of " +a +" and " +b +" is:" +lcm +","+hcf);
    }
}
