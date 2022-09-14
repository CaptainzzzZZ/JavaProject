public class Test_9_14 {
    public static void main(String[] args) {
        int i=10;
        i=i++;
        System.out.println(i);

        int a=10;
        int b=20;
        System.out.println(a!=b);

        int x=1;
        int y=2;
        int z=3;
        System.out.println(x<y&&y<z);
        System.out.println(x>y||x<y);//一定为true

//        System.out.println(!x<y);//err
        System.out.println(!(x<y));//!的操作数是boolean

        int p=10;//1010
        int l=11;//1011
        int m=12;//1110
        int n=m&l;//把&想象成乘法
        //0000 1110
        //0000 1011
        //乘完0000 1010
        int c=p|l;//把|想象成加法
        //0000 1010
        //0000 1011
        //0000 1011加法
        int g=p^m;//一样的为0，不一样为1
        //0000 1010
        //0000 1110
        //0000 0100

        int h=11;//0000 1011
        h=h>>1;//右移相当于除法11/2^1   0 0000 101==5 最前面补最高位的符号位
        h=h>>2;//11/2^2
        h=h<<1;//左移直接右边补0；
        h=h>>>1;//无符号《右移》左边统一补0
        System.out.println(h);

        int max=10>20?10:20;
        System.out.println(max);

        //运算符的优先级
        //单目运算符：右->左
        //双目运算符：左->右
        //还可以根据自己的需求加括号
    }
}
