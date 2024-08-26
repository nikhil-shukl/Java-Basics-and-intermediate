import java.util.*;
class BasicLL {

    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        
        list.add("I");
        list.add("am");
        list.add("Nikhil"); 
        list.add("Shukla");


        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        
        // Reverse iterate and print
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        
    }
}
