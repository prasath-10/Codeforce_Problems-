import java.util.*;

public class codeforce_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shape: ");
        String shape = sc.next();   // reads "sphere"

        if (shape.equalsIgnoreCase("sphere")) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();  // reads 7

            double area = 4 * Math.PI * r * r;
            double volume = (4.0 / 3) * Math.PI * r * r * r;

            System.out.println("Surface Area = " + area);
            System.out.println("Volume = " + volume);
        }

        sc.close();
    }
}
