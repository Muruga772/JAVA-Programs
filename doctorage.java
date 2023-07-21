import java.util.Scanner;

public class doctorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("patient count:");
        int patient = sc.nextInt();
        int income = 0;
        int age[]=new int[patient];
        while(patient<20)
        {
            for(int i=0;i<patient;i++)
            {
                age[i]=sc.nextInt();
            }
            for(int i=0;i<patient;i++)
            {
                if(age[i]>0&&age[i]<17)
                {
                    int fee=200;
                    income+=fee;
                }
                else if(age[i]>=17&&age[i]<40)
                {
                    int fee=400;
                    income+=fee;
                }
                else{
                    int fee=300;
                    income+=fee;
                }
            }
            System.out.println(income);
        }
    }
}