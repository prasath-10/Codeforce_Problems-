import java.util.*;
public class codeforce_9 {
    public static int isprime(int a){
        if(a <2)
        {
            return 0;
        }
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(isprime(i)==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
