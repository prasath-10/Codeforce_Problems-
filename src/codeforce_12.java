//import java.util.*;
//public class codeforce_12 {
//    public static boolean isvowel(char c){
//        c = Character.toLowerCase(c);
//        return c == 'a' || c == 'o' || c == 'y' ||
//                c == 'e' || c == 'u' || c == 'i';
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String b=sc.next();
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<b.length();i++)
//        {
//            char ch=b.charAt(i);
//            if(!isvowel(ch))
//            {
//
//
//               // System.out.println(ch);
//                ch = Character.toLowerCase(ch);
//                sb.append(".");
//                sb.append(ch);
//            }
//
//
//        }
//        System.out.println(sb.toString());
//    }
//}
//

import java.util.*;
public class codeforce_12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reversedNum=0;
        while(n>0){
            int a=n%10;
            reversedNum=reversedNum*10+a;
            n=n/10;
        }
        System.out.println(reversedNum);
    }
}
