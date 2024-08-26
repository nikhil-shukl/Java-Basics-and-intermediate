import java.util.*;
public class decimaltobinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int decimal = sc.nextInt();
    sc.close();  // Closing the scanner

    if (decimal == 0) {
      System.out.println("0");
      return;
    }

    StringBuilder binary = new StringBuilder();

    while (decimal > 0) {
      int remainder = decimal % 2;
      binary.append(remainder);
      decimal = decimal / 2;
    }

    // Reverse the string to get the correct binary representation
    binary.reverse();
    System.out.println(binary.toString());
  }
}
