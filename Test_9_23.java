public class Test_9_23 {
    public static void arrAdd(int arr[]){
        arr[4]=5;
    }
    public static void arrPrint(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
public static int getArea(int a,int b){
        return a*b;
}
    public static int add(int a,int b){
        return a+b;
}
public static int add(int a,int b,int c){
        return a+b+c;
}
public static double add(double aa,double bb){
        return aa+bb;
}
    public static void main(String[] args) {
        //方法重载   方法名可以相同 但是参数或者形参不可以相同
        int a=1;
        int b=2;
        int c=3;
        double aa=1.1;
        double bb=2.2;
        int sum1=add(a,b);
        int sum2=add(a,b,c);
        double sum3=add(aa,bb);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
    public static void main4(String[] args) {
        //方法使用
        int a=6;
        int b=5;
        int S=getArea(a,b);
        System.out.println(S);
    }
    public static void main3(String[] args) {
        //测试continue
        for (int i = 0; i < 10; i++) {
            if(i==5){
                continue;//5会跳过
            }
            System.out.print(i+" ");

        }
    }
    public static void main2(String[] args) {
        //测试break
        for (int i = 0; i < 9; i++) {
            System.out.print(i+" ");
            if(i>5){
                //i>5之后break跳出当前循环不在执行
                break;
            }
        }
    }
    public static void main1(String[] args) {
        int[] arr = new int[5];
//        int [5]arr2={1,2,3,4,5};
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arrAdd(arr);
        arrPrint(arr);
        int[] arr1 = {1, 3, 5, 4};
    }
}
