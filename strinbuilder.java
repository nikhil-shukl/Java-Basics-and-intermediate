import java.util.Scanner;

public class strinbuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String input = sc.next();
        sb.append(input); 
        System.out.println(sb);
        sb.setCharAt(0,'N');
        System.out.println(sb);

        sb.append("Shukla");
        System.out.println(sb);
        sc.close();
    }
}
