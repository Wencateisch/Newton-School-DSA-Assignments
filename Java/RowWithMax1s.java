import java.util.*;

class Main{
    static int rowWithMax1s(int arr[],int low, int high){
        if(high>=low){
            int mid = low+(high-low)/2;
            if(mid==0 || (arr[mid-1]==0) && (arr[mid]==1)){
                return mid;
            }else if(arr[mid]==0){
                return rowWithMax1s(arr,(mid+1),high);
            }else{
                return rowWithMax1s(arr,low,(mid-1));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i,j;
        int mat[][] = new int [m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(rowWithMax1s(mat,m,n));

    }
    private static char[] rowWithMax1s(int[][] mat, int m, int n) {
        return null;
    }
}