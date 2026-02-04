import java.util.*;
public class codeforce_13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str=sc.next();
        int anton=0;
        int danik=0;

        for(int i=0;i<a;i++)
        {
            char ch = str.charAt(i);
            if(ch=='A'){
                anton++;
            }
            else if(ch=='D'){
                danik++;
            }
        }
        if(anton > danik){
            System.out.println("Anton");
        }
        else if(anton < danik){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }

    }
}
