import java.util.*;

class Lswap {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in); 
        
        for (int i = 0; i < 4; i++) {
            list.add(sc.nextInt());
        }
        
        // Swap elements at indices 0 and 1
        int temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);

        // Swap elements at indices 2 and 3
        temp = list.get(2);
        list.set(2, list.get(3));
        list.set(3, temp);

        System.out.println(list);

        sc.close();
    }
}
