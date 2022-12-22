import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


@SuppressWarnings({"all"})
public class OJlanqiao {
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
