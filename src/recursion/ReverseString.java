package recursion;

public class ReverseString {static  String s = "";
    static String reverseIt(String str){

        int len = str.length();
        if(len==0)
            return s;
        else{
            s=s+str.charAt(len-1);
        return reverseIt(str.substring(0,len-1));}
    }


    public static void main(String args[]){
        String rev = reverseIt("garv");
        System.out.println("Reversed "+rev);
    }
}
