import java.util.Scanner;

public class arrayinteger {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={5,7,1,2,8,4,3};
        int l=arr.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]+arr[j]==n)
                {
                    System.out.print(arr[i]+ "+" + arr[j] +"=" + n);
                }
            }
            System.out.println();
        }
    }
}
