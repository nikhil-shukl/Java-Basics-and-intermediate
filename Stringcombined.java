//take an array of strings input 
//from the user  and find the cumulative length of all those strings.
import java.util.*;  
 public class Stringcombined {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String []names = new String[size];

        int combined=0;
        int cal=0;
        //your method Nikhil
        for(int i=0;i<size;i++){
            names[i]=sc.next();           
             cal=names[i].length();
            combined=combined+cal;

        }

        System.out.println(combined);
        sc.close();
    }
    
}
