
public class printpermutationR {
    public static void printpermutation(String str,int idx,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printpermutation(newStr, idx+1, perm+currchar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, 0, " ");
    }

}



