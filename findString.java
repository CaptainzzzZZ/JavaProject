import java.util.Scanner;

public class findString {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str1=scanner1.nextLine();
        System.out.println("“请输入要查找的子串");
        String str2=scanner1.nextLine();

        int[] a=new int[str1.length()];
        int i=0;
        int index=0;
        while(true){
            index=str1.indexOf(str2,index);
            if(index==-1){
                break;
            }
            a[i]=index;
            i++;
            index++;
        }
        for (int x:a) {
            System.out.println(x);

        }
    }
}
