import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class DayDayLeetcode {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j+i<=arr.length ; j+=2) {
                int k=i+j-1;
                for (int l = i; l <=k ; l++) {
                    sum+=arr[l];
                }
            }
        }
        System.out.println(sum);
    }
    public static void main14(String[] args) {
        int[] nums={3,2,0};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main13(String[] args) {
        int[] nums={1,1,2,2,3,3,5};
        //找出单个元素
        int ret=0;
        for (int num :nums) {
            ret=ret^num;
        }
        System.out.println(ret);
    }
    public static void main12(String[] args) {
        char[] s={'h','e','l','l','o'};
        //反转字符串
        int n=s.length;
        for (int i = 0,j=n-1; i<j ; i++,j--) {
            char tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
        }
        System.out.println(s);
    }
    public static void main11(String[] args) {
        //删除链表重复元素
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);
        if(linkedList.size()==0){
            System.out.println("error");
        }
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = i+1; j < linkedList.size() ; j++) {
                if(linkedList.get(i)== linkedList.get(j)){
                    linkedList.remove(j);
                }
            }
        }
        for (Object o :linkedList) {
            System.out.println(o);
        }

    }
    public static void main10(String[] args) {
        int[] nums={1,1,2,3,4,5,5,6};//双指针删除有序数组重复元素
        int slow = 1;
        int fast= 1;
        while(fast< nums.length){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i :nums) {
            System.out.println(i);
        }
    }
    public static void main9(String[] args) {
        String ss="abc";
        System.out.println(ss.replaceAll("a", "").length());///字符串剩余几个
        int count=0;
        for (int i = 1; i <2021 ; i++) {
            String str=i+"";
            if(str.contains("2")){
                count=count+str.length()-str.replaceAll("2","").length();
                //replaceAll替换目标exp后剩余个数
            }
        }
        System.out.println(count);
    }
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n= scanner.nextInt();
        int max=0;
        int min=100;
        int sum=0;
        int nn=(int)n;
        while(n-->0){
            int m= scanner.nextInt();
            if(m>max){
                max=m;
            }
            if(m<min){
                min=m;
            }
            sum+=m;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum/nn);
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=new String(scanner.nextLine());
        if(str.length()==0||str.length()%2==1){
            return ;
        }
        Stack<Object> stack = new Stack<>();

    }
    public static void main6(String[] args) {
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
