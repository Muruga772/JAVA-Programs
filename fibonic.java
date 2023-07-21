import java.util.Scanner;

public class fibonic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=1,n2=2;
        int num= sc.nextInt();
        int temp=0;
        for(int i=3;i<num;i++)
        {
            temp=n1+n2;
            n1=n2;
            n2=temp;
        }
        System.out.println(temp);
    }
}
