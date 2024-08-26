import java.util.*;
  public class arraysTranspose {
    public static void main(String args []){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
        
       sc.close();
       
       int numbers[][]= new int[n][m];

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          numbers[i][j]=sc.nextInt();
        }
       }
       System.out.println(" The Transpose is :");

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          //new learning
          System.out.print(numbers[j][i]+" ");
        }
        System.out.println();
       }
    }
    
}
