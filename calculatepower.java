import java.util.Scanner;
public class calculatepower{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
         System.out.println("Enter X");

        int n = sc.nextInt();
         System.out.println("Enter n");

        int result = 1;

        for(int i=1 ;i<=n; i++){
            result=result*X;
        }
        System.out.println("x to the power n is:"+result);

        sc.close();
    }
    
}

