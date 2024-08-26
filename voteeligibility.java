import java.util.*;

public class voteeligibility {
    public static String voteligibility(int age) {
        if(age>18){
            return ("eligible for vote");
        }else{
            return ("not eligible for vote");
        }
    }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.println(voteligibility(age));

            sc.close();

        }
        
}
