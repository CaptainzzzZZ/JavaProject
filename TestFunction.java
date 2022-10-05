package TestFunction;

public class TestFunction {
    public static int fb1123(int x){
        if(x==1||x==2){
            return 1;
        }
        return fb1123(x-1)+fb1123(x-2);
    }
    public static void print1234(int x){
        if(x<=9){
            System.out.println(x);
        }
        else {
            print1234(x/10);
            System.out.println(x%10);
        }
    }
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void Hanoi(int n,char pos1,char pos2 ,char pos3) {
        if(n==1){
            move(pos1,pos3);
        }
        else {
            Hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);//把第一个柱子的最后一个移到第三个柱子
            Hanoi(n-1,pos2,pos1,pos3);

        }
    }
    public static int JumpStep(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return JumpStep(n-1)+JumpStep(n-2);
        }
    }
    public static void main(String[] args) {
        int ret = fb1123(6);
        System.out.println(ret);
        print1234(1234);
        Hanoi(1,'A','B','C');
        System.out.println();
        Hanoi(2,'A','B','C');
        System.out.println();
        Hanoi(3,'A','B','C');
        int num=JumpStep(3);
        System.out.println(num);

    }
}
