import java.util.*;
public class codeforce_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr=new int[a];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i] <= b){
                sum=sum+1;
            }
            else{
                sum=sum+2;
            }
        }
        System.out.println(sum);
    }
}
