import java.util.Scanner;

public class DayDayLeetcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.nextLine());
        String str2 = new String(scanner.nextLine());
        Integer n1=Integer.valueOf(Integer.parseInt(str,2));
        int nn1=n1.intValue();
        Integer n2=Integer.valueOf(Integer.parseInt(str2,2));
        int nn2=n2.intValue();

        Integer oxret=nn1+nn2;
        String binret=Integer.toBinaryString(oxret);
        System.out.println(binret);

    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        String str=(new StringBuilder(x+"")).reverse().toString();
        String str2=new String(x+"");
        System.out.println(str.equals(str2));
    }
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String S=scanner.nextLine();
        if(S.length()==0){
            System.out.println("空串");
        }
        int count=1;
        StringBuilder sb=new StringBuilder();
        char ch=S.charAt(0);

        for (int i = 1; i < S.length(); i++) {
            if(S.charAt(i)==ch){
                count++;

            }
            else{
                sb.append(ch);
                sb.append(count);
                ch=S.charAt(i);
                count=1;
            }
        }
        sb.append(ch);
        sb.append(count);
        System.out.println(sb.length()<=S.length()?sb.toString():S);
    }
    public static void main3(String[] args) {
        int[] nums={1,3,2,1,0,1,3,5,8,5,8};
        int val=1;
        int newnums=0;
        int oldnums=0;

        for ( oldnums = 0; oldnums < nums.length; oldnums++) {
            if(nums[oldnums]!=val){
                nums[newnums]=nums[oldnums];
                newnums++;
            }
        }
        System.out.println(newnums);
    }
    public static void main2(String[] args) {
        //在数组中找两数之和
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
