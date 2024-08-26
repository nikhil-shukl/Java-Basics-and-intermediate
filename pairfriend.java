public class pairfriend {
    public static int pairfriends(int n){
        if(n<=1){
            return 1;
        }
        return pairfriends(n-1)+(n-1)*pairfriends(n-2);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pairfriends(n));
    }
}
