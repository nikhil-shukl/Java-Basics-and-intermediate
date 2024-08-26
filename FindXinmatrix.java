import java.util.*;
 public class FindXinmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
            
          int X = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==X){
                    System.out.println("Element of X is found at location:"+i+","+j);
                    sc.close();
                }
            }
        }

    }
    
}
