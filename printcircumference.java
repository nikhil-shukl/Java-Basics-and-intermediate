import java.util.Scanner;

public class printcircumference {
    public static Double getcircumference(Double radius) {
        return 2*3.14*radius;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(getcircumference(radius));

        sc.close();
    }
    
}
