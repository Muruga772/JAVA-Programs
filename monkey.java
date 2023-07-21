import java.util.Scanner;

public class monkey {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("total no of monkeys:");
        int n=sc.nextInt();
        System.out.println("total no of eatable banana:");
        int k=sc.nextInt();
        System.out.println("total no of eatable peanut:");
        int j=sc.nextInt();
        System.out.println("total no of banana:");
        int m=sc.nextInt();
        System.out.println("total no of peanut:");
        int p=sc.nextInt();
        int N=m/k;
        System.out.println(N);
        int M=p/j;
        System.out.println(M);
        int L=N+M;
        System.out.println(L);
        int S=n-L;
        if(m%k>0) {
            System.out.println("no.of monkey left");
            System.out.println(S - 1);
        }
        else{
            System.out.println("no.of monkey left");
            System.out.println(S);
        }



    }
}
