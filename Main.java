import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s="123456";
        String ss=s.replace('1','0');
        System.out.println(ss);
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch= str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                ch[i]=(char)(ch[i]-32);
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(""+ch[i]);
        }
    }
    public static void main6(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        if(t>s){
            System.out.println(t-s);
        }
        else if(t==s){
            System.out.println(0);
        }
        else {
            System.out.println(7-s+t);
        }
    }
    public static void main3(String[] args) {
        int sum=0;
        double sn=0;
        while(sn<12){
            sn=sn+1.0/(1.0+sum);
            sum++;
        }
        System.out.println(sum);
    }
    public static void main2(String[] args) {
        int[] month={ 0,31,28,31,30,31,30,31,31,30,31,30,31};
        //           4  3  4  3  4   3  4  4 3  4  3  4
//        int ret=365/7;
//        int ret2=4+3+4+3+4+3+4+4+3+4+3+4;
//        System.out.println(ret2);
//        System.out.println(ret);
        int sum=0;
        int week=6;
        for (int i = 1; i <=12 ; i++) {
            for (int j = 1; j <month[i] ; j++) {
                if(week==6||week==0){
                    sum++;
                }
                else if(j==1||j==11||j==21||j==31){
                    sum++;
                }
                week++;
                week=week%7;
            }
        }
        System.out.println(sum);

    }
}
