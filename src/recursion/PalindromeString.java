package recursion;

public class PalindromeString {
    static boolean isPalin(String str){

        int len = str.length();
        if(len==0 || len==1)
            return true;
        if(str.charAt(0) == str.charAt(len-1)){
            return isPalin(str.substring(1,len-1));
        }
        return false;

    }

    public static void main(String args[]){
        boolean check = isPalin("helleh");
        System.out.println(check);
    }
}
