import java.util.Scanner;

class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}