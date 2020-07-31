package recursion;

public class PowerSetString {
    static void powerSet(String s, String t){
        System.out.println(t);
        int n = s.length();
        if(n>0){
            for(int i=0;i<n;i++){
                powerSet(s.substring(i+1,n),t+s.charAt(i));
            }
        }
    }


    public static void main(String args[]){
     String str = "abc";
     String crr = "";
     int index = -1;
     powerSet(str,crr);
    }
}
