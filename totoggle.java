public class totoggle {
    public static void main(String[] args) {
        int n = 29;
        int pos = 2;
        int bitmask= 1<<pos;

        int newbitmask = n^bitmask;

        System.out.println("number is :"+n);
        System.out.println("number which is toggle at bit position 2 is"+newbitmask);
    }
    
}
