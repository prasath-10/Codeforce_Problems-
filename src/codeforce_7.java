import java.util.*;
public class codeforce_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            if(Character.isAlphabetic(ch)){
                set.add(ch);
            }

        }
        System.out.println(set.size());
        //goat
    }
}
