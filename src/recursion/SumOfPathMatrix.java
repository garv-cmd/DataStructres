package recursion;

public class SumOfPathMatrix {
    static int path(int n,int m){
        if(n==1 || m==1)
            return 1;
        return path(n,m-1)+path(n-1,m);
    }
    public static void main(String args[]){
        int res = path(4,4);
        System.out.println(res);
    }
}
