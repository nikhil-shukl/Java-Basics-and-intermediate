import java.util.*;
public class Calculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int sum = (a+a);
    System.out.println(sum);
    
    int differ = (a-a);
    System.out.println(differ);
    
    int product = (a*a);
    System.out.println(product);

    int divide = (a/a);
    System.out.println(divide);

    
    sc.close();
 }
}
