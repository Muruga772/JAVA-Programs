import java.util.Scanner;

public class threshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 8;
        int count = 0;
        int n = sc.nextInt();
        int arr[] = new int[10];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    if(arr[i]<arr[j]&&arr[j]<arr[k]&&arr[i]+arr[j]+arr[k]<=t)
                    {
                        count++;
                    }
                }

               }
        }
        System.out.println(count);
    }
}

