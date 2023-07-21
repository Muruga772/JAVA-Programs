import java.util.Scanner;

public class arraynum
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]={-1,0,1,2,-1,4};
    int l=arr.length;
    for(int i=0;i<l-1;i++)
    {
        for(int j=i+1;j<l;j++)
        {
            for(int z=j+1;z<l;z++)
            {
                if(arr[i]+arr[j]+arr[z]==n)
                {
                    System.out.print(arr[i]+ "+" + arr[j]+ "+" + arr[z] +"=" + n);
                }
            }


        }
        System.out.println();
    }
}
}
