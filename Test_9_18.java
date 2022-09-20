import java.util.Scanner;

public class Test_9_18 {


    public static int numMax(int a,int b,int c){
        int max1=a>b?a:b;
        return max1>c?max1:c;
    }
    public static int fFun(int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            return fFun(n-1)+fFun(n-2);
        }
    }
    public static void swap(int []arr){
        int tmp=arr[0];
        arr[0]=arr[1];
        arr[1]=tmp ;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;

    }
    public static double sum(double x,double y){
        return x+y;
    }



    public static void main4(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        double x=1.1;
        double y=2.2;
        int ret1=sum(a,b);
        int ret2=sum(a,b,c);///方法重载
        double ret3=sum(x,y);

    }
    public static void main3(String[] args) {
        int []arr={10,20};
        swap(arr);
        System.out.println("arr[0]="+arr[0] + "arr[1]="+arr[1]);
    }
    public static void main2(String[] args) {
//        int []arr=new int [30];
//        arr[0]=1;
//        arr[1]=1;
        int ret = fFun(5);
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        int a=7;
        int []arr={0,36,4,2,5,6,1};
        int b=8;
        int c=9;
        int max=numMax(a,b,c);
        System.out.println(max);
    }
}
