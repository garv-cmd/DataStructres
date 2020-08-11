package Extras;

public class MinRefills {
    static int getAns(int arr[] , int n,int L){
        int current = 0;
        int numReffils = 0;
        while(current <= n){
            int lastRefill = current;
            while(current<=n && (arr[current+1]-arr[lastRefill]<=L)){
                current++;
            }
            if(lastRefill==current)
                return -1;
            if(current <= n)
                numReffils++;
        }
        return numReffils;
    }
    public static void main(String args[]){
        int size = 10;
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = i;
        }
        int finalPosition = arr[size-2];
         int res= getAns(arr,finalPosition,2);
        System.out.println(res);

    }
}
