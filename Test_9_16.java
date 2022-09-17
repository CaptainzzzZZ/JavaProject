import java.util.Scanner;

public class Test_9_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int randomNum=(int)(Math.random()*100);
//
//        while(true){
//            System.out.println("请输入你的答案：");
//            int guessNum= sc.nextInt();
//            if(randomNum>guessNum) {
//                System.out.println("猜小了");
//            }
//            else if(randomNum<guessNum) {
//                System.out.println("猜大了");
//            }
//            else{
//                System.out.println("猜对了");
//                break;
//            }
//        }

//        int num=sc.nextInt();
//        double sum=0;
//        int flg=1;
//        for(int i=1;i<=num;i++){
//            sum=sum+1.0/i*flg;//1/1-1/2+1/3-1/4+1/5+....+
//            flg=-flg;
//        }
//        System.out.println(sum);

//        for (int n=11;n<=9999;n++) {
//            int tmp = n;
//            int count=0;
//            while (tmp != 0) {
//                count++;
//                tmp = tmp / 10;
//            }
//            tmp = n;
//            double sum = 0;
//            while (tmp != 0) {
//                sum = sum + Math.pow((double) (tmp % 10), (double) count);
//                tmp=tmp/10;
//            }
//            if (sum == n) {
//                System.out.println(n);
//            }
//        }

        int count=0;
        int num=sc.nextInt();

//        for (int i = 0; i < 32; i++) {
//            if(((num>>i&1)==1)){
//                count++;
//            }
        while(num!=0){
            num=num&(num-1);
            count++;
        }
        System.out.println(count);
    }
}
