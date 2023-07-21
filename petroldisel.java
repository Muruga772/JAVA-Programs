import java.util.Scanner;

public class petroldisel {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int e1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int e2 = sc.nextInt();
        System.out.println("enter month:");
        int month=sc.nextInt();
        int petrol=c1+(d1/a1*b1)*month+month*e1;
        System.out.println(petrol);
        int diesel=c2+(d2/a2*b2)*month+month*e2;
        System.out.println(diesel);
        if(petrol<diesel){
            System.out.println("petrol is best");
        }
        else {
            System.out.println("diesel is best");

        }
    }
}
