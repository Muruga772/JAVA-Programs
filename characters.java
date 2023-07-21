import java.util.Scanner;

public class characters {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int a=s1.length();
        char c[]=s1.toCharArray();
        for(int i=0;i<a;i++)
        {
            if(i==0)
            {
                c[i]=Character.toUpperCase(c[i]);
            }
            if(c[i]==' ')
            {
                c[i+1]=Character.toUpperCase(c[i+1]);
            }
        }
        System.out.println(c);

    }
}
