import java.util.Scanner;

public class pipe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int outcome=sc.nextInt();
        int rust=sc.nextInt();
        int a[]=new int[income];
        for(int i=0;i<income;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[outcome];
        for(int i=0;i<outcome;i++)
        {
            b[i]=sc.nextInt();
        }
        int i=a[0]+a[1]+a[2];
        int s=b[0]+b[1]+b[2];
        int res=(i-s)+rust;
        if(i>0){
            System.out.println(res);
        }
        else{
            System.out.println();
        }


    }
}
