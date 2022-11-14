import java.util.Scanner;

public class DayDayLeetcode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String goal=scanner.nextLine();
        if(s.length()!=goal.length()){
            System.out.println("no");
        }
        for (int i = 0; i < goal.length(); i++) {
            boolean flag=true;
            for (int j = 0; j < goal.length(); j++) {
                if(s.charAt((i+j)%s.length())!=goal.charAt(j)){
                    flag=false;
                    break;//已经不一样了 直接跳出
                }
            }
            if (flag){
                System.out.println("yes");  //当循环结束了没有在if里跳出 说明这一趟是满足的
            }
        }
        System.out.println("no");//每一趟for都是跳出的说明不可以匹配

    }
}
