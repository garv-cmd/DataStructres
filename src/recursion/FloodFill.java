package recursion;

public class FloodFill {
    public static void main(String args[]){

        int a[][]={{1,1,1,1,1,1,1,1},
                   {1,1,1,1,1,1,0,0},
                   {1,0,0,1,1,0,1,1},
                   {1,2,2,2,2,0,1,0},
                   {1,1,1,2,2,0,1,0},
                   {1,1,1,2,2,2,2,0},
                   {1,1,1,1,1,2,1,1},
                   {1,1,1,1,1,2,2,1}

        };
        fill(a,1,1,99,1);
        for(int i=0;i<a.length;i++){
            System.out.println();
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }

    }

    static void fill(int a[][],int r,int c,int toFill,int prevFill){

        int rows = a.length;
        int col = a[0].length;

        if(r<0 || r>=rows || c<0 || c>=col){
            return;
        }
        if(a[r][c] != prevFill){
            return;
        }
        a[r][c] = toFill;
        fill(a,r-1,c,toFill,prevFill);
        fill(a,r,c-1,toFill,prevFill);
        fill(a,r+1,c,toFill,prevFill);
        fill(a,r,c+1,toFill,prevFill);
    }



}
