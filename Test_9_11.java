public class Test_9_11 {
    public static void main(String[] args) {
        //()里的是运行时命令行参数！！
        //  数组所用的内存实在堆区上的
//        System.out.println("hello world");
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println("hhhhhhh"+10+20);//有字符串+号是个连接符
//        System.out.println(10+20);//没字符串+号是个运算符
//
//        long a=10L;
//        System.out.println(a);
//
//        int i;
//        for(i=0;i< args.length;i++){
//            System.out.println(args[i]);
//        }


//        double a=1.1;//精确到小数点后六位//8个字节
//        System.out.println(a*a);//1.210000000002//因为浮点数在内存中
//        //存储遵循IEEE754规定，在进制转换中可能会有误差
//        System.out.printf("%.2f\n",a*a);//小数点后两位
//
//        char ch='a';//两个字节可以存一个汉字Unicode表比ASCII码大有埃及语等等
//        char ch2='于';
//        char ch3=97;
//        System.out.println(ch+""+ ch2+""+ ch3);

//        byte b=127;//-128~127;
//        System.out.println(Byte.MAX_VALUE+1);//输出128 因为println默认是以整形输出
//        System.out.println(Integer.MAX_VALUE+1);//默认是整形所以加1变成了负的

//        short a=666;//2byte
//        System.out.println(Short.MAX_VALUE+1);
//
//        boolean b=true;//没有规定大小有的是1字节有的是1比特
//        if(/*1*/true){
//            //在Java中没有0为false，非0为true
//        }

        String abc="\'abccba\'";
        System.out.println(abc);

        final int F=100;//跟C中的define类似

        String s="100";
        int num=Integer.parseInt(s);//把字符串转换成整型
        System.out.println(num);//100
        int n=123456;
        String sn=String.valueOf(n);//把整形转换成字符串
        System.out.println(sn);//"123456"

        String []s1={"吕瑱填","吕瑱填","啊对对对","大傻子"};
        String[]s2={"吕瑱填","猪猪猪","吕瑱填","别狗叫"};
        String[]s3={"吕瑱填","我的宝儿","吕瑱填","臭猪猪草莓宝宝"};

        int len1= s1.length;
        int len2= s2.length;
        int len3=s3.length;
        int rand1=(int)(Math.random()*len1);
        int rand2=(int)(Math.random()*len2);
        int rand3=(int)(Math.random()*len3);
        System.out.println(s1[rand1]+""+s2[rand2]+""+s3[rand3]);
        System.out.println(rand2);


    }
}
