import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Wrap {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入yyyy-MM-dd");
        String str=sc.nextLine();
        Date d=sdf.parse(str);
        long t=System.currentTimeMillis()-d.getTime();
        t=t/1000/60/60/24;
        System.out.println(t);


    }
    public static void main3(String[] args) {
        Date d1=new Date();
        Date d2=new Date(9000000000000L);
        System.out.println(d1.getTime());
        System.out.println(d2.getTime());
        d1.setTime(0L);
        System.out.println(d1.compareTo(d2));
        SimpleDateFormat d3=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String str1=d3.format(d1);
        String Str2=d3.format(d2);
        System.out.println(str1);
        System.out.println(Str2);
    }
    public static void main2(String[] args) {
        BigInteger bi=BigInteger.valueOf(66);
        for (int i = 1; i < bi.longValue() ; i++) {
            bi=bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);
    }
    public static void main1(String[] args) {
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
        bd3=bd1.divide(bd2,50,BigDecimal.ROUND_HALF_UP);
        System.out.println(bd3.doubleValue());
        System.out.println(bd3.toString());

        bd3= bd3.setScale(2,BigDecimal.ROUND_HALF_UP);//newScale是小数点后几位  对一个数舍入运算
        System.out.println(bd3.doubleValue());


    }
}
