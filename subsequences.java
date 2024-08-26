public class subsequences{
    public static void subsequence(String str,int idx,String newString) {
        if(idx == str.length()){
            System.err.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        subsequence(str,idx+1,newString+currchar);

        subsequence(str,idx+1,newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, " ");
    }
}