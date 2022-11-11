import java.math.BigDecimal;
import java.util.Scanner;

public class Wrap {
    public static void main(String[] args) {
        Integer a=new Integer(5);
        Integer b=Integer.valueOf(5);
        Integer c=Integer.valueOf(5);
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a.equals(b));
        System.out.println(a.byteValue());
        System.out.println(Integer.parseInt("a",16));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toOctalString(11));//11/8=1..3
        System.out.println(Integer.toHexString(255));//255/16=15..15
        double d1=2;
        double d2=1.9;
        double d3=d1-d2;
        System.out.println(d3);//0.100000000009
        BigDecimal aa=BigDecimal.valueOf(2);
        BigDecimal bb=BigDecimal.valueOf(1.9);
        System.out.println(aa.subtract(bb));//0.1
        BigDecimal cc=BigDecimal.valueOf(10);
        BigDecimal dd=BigDecimal.valueOf(3);
        System.out.println(cc.divide(dd,1));
        System.out.println("请输入两个浮点数");
        double dd1=new Scanner(System.in).nextDouble();
        double dd2=new Scanner(System.in).nextDouble();
        System.out.println(dd1*dd2);
        System.out.println(dd1+dd2);
        System.out.println(dd1-dd2);
        System.out.println(dd1/dd2);
        BigDecimal bd1=BigDecimal.valueOf(dd1);
        BigDecimal bd2=  BigDecimal.valueOf(dd2);
        BigDecimal bd3;
        bd3=bd1.add(bd2);
        System.out.println(bd3.doubleValue());
        bd3=bd1.subtract(bd2);
        System.out.println(bd3.doubleValue());
        bd3=bd1.multiply(bd2);
        System.out.println(bd3.doubleValue());
        bd3=bd1.divide(bd2,10,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(bd3.doubleValue());


    }
}
