import java.util.*;
public class codeforce3 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;
        while (a <= b) {
            count++;
            a = a * 3;
            b = b * 2;
        }
        System.out.println(count);
    }
}
