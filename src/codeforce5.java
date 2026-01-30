import java.util.*;

public class codeforce5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int t=scan.nextInt();
        String b=scan.next();
        int i=1;
        char[] arr = b.toCharArray();
        while(i <= t){
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]== 'B' && arr[j+1] == 'G')
                {
                    char temp=arr[j];
                    arr[j] = arr[j+1];

                    arr[j+1]=temp;
                    j++;
                }

            }
            i++;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]);
        }
    }
}
