import java.util.Scanner;

public class Test_9_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
//        String j = a.nextLine();//会读入nextInt()的回车键，一般不与他连用
        String j = scan.next();//不会读入回车 但是会读入空格
        System.out.println(i);
        System.out.println(j);
        while (scan.hasNext()) {
            //hasnext()是一个bool类型
            if (/*必须是bool类型*/  i != 0) {
                System.out.println(i);
                break;
            } else {
                System.out.println(0);
            }
        }
//      switch()不支持的类型long float double bool
        switch (i) {
            case 1:
                System.out.println("1111111");
                break;
            case 2:
                System.out.println("222222222");
                break;
            default:
                break;
//        }
//        int i;
//        int j;
//        int sum=0;
//        int n= 3;
//        for(i=n;i>=1;i--) {
//            int ret=1;//ret每一次进来都要重新置成1；
//            for(j=1;j<=i;j++){
//                ret=ret*j;
//            }
//            sum=sum+ret;
//        }
//        System.out.println(sum);

//        int i;
//        int j;
//        int ret=1;
//        for(i=9;i>=1;i--) {
//            for (j=i;j>=1;j--) {
//                ret=i*j;
//                System.out.printf("%d*%d=%d ",i,j,ret);
//            }
//            System.out.printf("\n");
//        }
        }
    }
}