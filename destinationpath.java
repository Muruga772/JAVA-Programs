import java.util.Arrays;
import java.util.Scanner;

public class destinationpath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(a[i]);
//        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        if (a[0] == a[1] || a[0] == a[2] || a[0] == a[3]) {
            System.out.println("Equal");
        } else {
            System.out.println(a[0]);
            System.out.println(a[1]);
        }
    }
}


