import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


@SuppressWarnings({"all"})
public class OJlanqiao {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=2019 ; i++) {
            int t=i;
            while(t>0){
                if (t%10==2||t%10==0||t%10==1||t%10==9){
                    sum+=i;
                    break;
                }
                t/=10;
            }
        }
        System.out.println(sum);
    }
    public static void main4(String[] args) {
        HashSet hashSet = new HashSet();
        int count=0;
        for (int i = 123; i <988 ; i++) {
            for (int j = 123; j <988 ; j++) {
                int t=i+j;
                if (t<1000){
                    String str=""+i+j+t;
                    for (int k = 0; k < str.length(); k++) {
                        hashSet.add(str.charAt(k));
                    }
                    if (hashSet.size()==9&& (!hashSet.contains('0'))){
                        count++;
                    }
                    hashSet.clear();
                }
            }
        }
        System.out.println(count);
    }
    public static void main3(String[] args) {
        //杨辉三角
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        Integer[][] arr = new Integer[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i][0]=1;
            arr[i][i]=1;
            if (i>1){
                for (int j = 1; j < i; j++) {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];

                }
            }
        }
        int count=0;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                if (arr[i][j]==n){
                    System.out.println(count);
                    return ;
                }
            }
        }

    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chars = new char[30][50];
        int count=0;
        for (int i = 0; i < 30; i++) {
            chars[i]=scanner.nextLine().toCharArray();
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 50; j++) {
                //左->右
                for (int k = j+1; k <50 ; k++) {
                    if (chars[i][j]<chars[i][k]){
                        count++;
                    }
                }
                //上->下
                for (int k = i+1; k <30 ; k++) {
                    if (chars[i][j]<chars[i][k]){
                        count++;
                    }
                }
                //左上->右下
                for (int x=i+1,y=j+1;x<30&&y<50;x++,y++) {
                    if (chars[i][j]<chars[x][y]){
                        count++;
                    }
                }
                //左下->右上
                for (int x=29,y=j+1;x>=0&&y<50;x--,y++) {
                    if (chars[i][j]<chars[x][y]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(51435);
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i <=n/i; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) {
        int count=0;
        for (int i = 2; i <=2019 ; i++) {
            int j=2019-i;
            if(isPrime(i)&&isPrime(j)){
                count++;
            }
        }
        System.out.println(count/2);
    }
    public static void main0(String[] args) {
        BigInteger b0 = new BigInteger("1");
        BigInteger b1 = new BigInteger("1");
        for (int i = 2; i <=64 ; i++) {
            b1=b1.multiply(new BigInteger("2"));
            b0=b0.add(b1);
        }
        System.out.println(b0);
    }
}
