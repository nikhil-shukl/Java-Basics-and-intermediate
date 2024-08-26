import java.util.*;
public class Fibonacci {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0;
        System.out.print(a+" ");
        int b=1;
        if(n>1){
        for(int i=2; i<n; i++){
        System.out.print(b+" ");

        int hosh = b;
        b = a+b;
        a = hosh;


        }
        System.out.println();
        sc.close();
    }
    }
    
}
