import java.util.Scanner;

public class DayDayLeetcode {
    public static void main(String[] args) {
        String s="bbbbb";
        if (s==" "){
            System.out.println("空串");
        }
        int count=1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if(s.charAt(i)!=s.charAt(j)){
                    count++;
                }
            }
        }
    }
    public static void main2(String[] args) {
        int[] nums=new int[10];
        int target=5;
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i]= scanner.nextInt();
        }
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    System.out.println(i+""+j);
                    break;
                }
            }
        }
    }
    public static void main1(String[] args) {
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
