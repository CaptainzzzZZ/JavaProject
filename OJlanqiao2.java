import java.util.ArrayList;
import java.util.Scanner;

public class OJlanqiao2 {
    public static void main(String[] args) {
        int n= scanner.nextInt();
        
    }
    static Scanner scanner=new Scanner(System.in);
    static int n= scanner.nextInt();//行
    static int m= scanner.nextInt();//列
    static int check(int x,int y){
        int count=0;
        for (int i = x-1; i <=x+1 ; i++) {
            for (int j = y-1; j <=y+1 ; j++) {
                if (i>=1&&i<=n&&j>=1&&j<=m){
                    count++;
                }
            }
        }
        return count;
//        if (i-1>=1&&i+1<=n&&j-1>=1&&j+1<=m){
//            count++;
//        }
//        就是这个式子判断9次
    }
    public static void main6(String[] args) {
        int[][] arr = new int[n+2][m+2];
        int[][] tempArr = new int[n+2][m+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                double sum=(arr[i][j]+arr[i+1][j]+arr[i-1][j]+arr[i][j+1]+arr[i][j-1]
                        +arr[i-1][j-1]+arr[i+1][j+1]+arr[i-1][j+1]+arr[i+1][j-1]);
                double meet=check(i,j);
                tempArr[i][j]=(int)Math.floor(sum/meet);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=m ; j++) {
                System.out.print(tempArr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main3(String[] args) {
        int[] arr = new int[101];
        for (int i = 2; i <=100 ; i++) {
            int t=i;
            for (int j = 2; j <=t/j ; j++) {
                while (t%j==0){
                    arr[j]++;
                    t=t/j;

                }
            }
            if (t>1){
                arr[t]++;
            }
        }
        long sum=1;
        for (int i = 1; i <= 100; i++) {
            sum=sum*(arr[i]+1);
        }
        System.out.println(sum);
        System.out.println(39001250856960000L);
    }
    public static void main2(String[] args) {
        int n= scanner.nextInt();
        int m=scanner.nextInt();
        int t= scanner.nextInt();
        int[][] ints = new int[n][m];
        for (int i = 0; i < t; i++) {
            int r=scanner.nextInt();
            int c=scanner.nextInt();
            ints[r-1][c-1]=1;
        }
        int k=scanner.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ints[i][j]==1){
                    for (int l = 1; l <= k; l++) {
                        if(i+l<n) ints[i+l][j]=2;
                        if (i-l>=0)    ints[i-l][j]=2;

                        if ((j+l<m))ints[i][j+l]=2;
                        if (j-l>=0)  ints[i][j-l]=2;

                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ints[i][j]==1||ints[i][j]==2)count++;
            }
        }
        System.out.println(count);
    }
}
