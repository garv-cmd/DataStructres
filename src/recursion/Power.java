package recursion;

public class Power {
    static int power(int a,int b){
       if(b==0)
            return 1;
       // return a*power(a,b-1);
        //fast
        if (b%2==0){
            return power(a*a,b/2);

        }
        else return a*power(a,b-1);
    }
    public static void main(String args[]){
        int pow = power(2,5);
        System.out.println(pow);
    }
}
