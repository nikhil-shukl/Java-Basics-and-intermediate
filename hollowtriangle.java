public class hollowtriangle {
    public static void main(String[] args) {
        int n = 6;

        for(int i = 1;i<n;i++){
            for(int k=1;k<n-i;k++){

                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
               if(j==1||i==n-1){
                System.out.print("*");
                }
               else{  System.out.print(" "); }
            }

        
            for(int j=1;j<=i;j++){
               if(i==n-1|j==i){
                System.out.print("*");
               }
               else{  System.out.print(" "); }
            }
            for(int k=1;k<n-i;k++){

                System.out.print(" ");
               }  
               System.out.println();
         }
    }
}   

