import java.util.*;
class LL{
    public static void main(String args[]){
        LinkedList<Integer>list = new LinkedList<>();
        Scanner sc = new Scanner(System.in); 
        
        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());
        }

        for(int i = list.size()-1; i>=0;i--){

            System.out.print(list.get(i)+" ");
           
        }
       sc.close();
    }
}