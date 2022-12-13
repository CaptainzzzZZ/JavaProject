import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings({"all"})
public class DayDayLeetcode {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = {'A','B','C','D','E','F','G','H','I','J','K',
                          'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int n=2019;
        while(n>0){
            stringBuilder.append(chars[(n%26)-1]);
            n=n/26;
        }
        System.out.println(stringBuilder.reverse().toString());
    }
    public static int SingleChar(String str){
        int[] arr=new int[26];
        int ret=0;
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                ret++;
            }
        }
        return ret;
    }
    public static void main32(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        if (str.length()==0)return ;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String S=str.substring(i,j+1);
                int ret=SingleChar(S);
                count+=ret;
            }
        }
        System.out.println(count);
    }
    public static void main31(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int[] ints = new int[N];
        for (int i = 0; i < ints.length; i++) {
            ints[i]= scanner.nextInt();
        }
        Arrays.sort(ints);
        for (Object o :ints) {
            System.out.print(o+" ");
        }
        System.out.println();
        for (int i = ints.length-1; i >=0 ; i--) {
            System.out.print(ints[i]+" ");
        }

    }
    public static void main30(String[] args) {
        int ret=1;
        for (int i = 0; i < 20; i++) {
            ret=ret+i*4;
        }
        System.out.println(ret);
    }
    public static void main29(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        long n= scanner.nextLong();
        Date date = new Date(n);
        String time=dateFormat.format(date);
        System.out.println(time);
    }
    public static void main28(String[] args) {
        for (int i = 19000101; i <20120312 ; i++) {
            int yyyy=i/10000;
            int mm=i/100%100;
            int dd=i%100;
            if(i%2012==0&&i%3==0&mm==6&&i%12==0&&dd<=31){
                System.out.println(i);
            }
        }
    }
    public static boolean check(int n){
        String str=n+"";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='9'||str.charAt(i)=='2'){
                return true;
            }
        }
        return false;
    }
    public static void main27(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (check(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static boolean huiwen2(String str){
        HashSet<Object> hashSet = new HashSet<>();
        for (int i = 0,j=str.length()-1; i <=j ; j--,i++) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        if(!(str.charAt(0)==str.charAt(2)&&str.charAt(1)==str.charAt(3))&&
                (str.charAt(4)==str.charAt(6)&&str.charAt(5)==str.charAt(7))){
            return false;
        }
        return true;

    }
    public static boolean huiwen1(String str){
        for (int i = 0,j=str.length()-1; i <=j ; j--,i++) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main26(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        for (int i = num+1; i <=89991231 ; i++) {
            if(huiwen1(i+"")){
                System.out.println(i);
                break;
            }
        }
        for (int i = num+1; i <=89991231 ; i++) {
            if(huiwen2(i+"")){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main25(String[] args) {
        String str=new Scanner(System.in).nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(str.length()-count);
    }
    public static void main24(String[] args) {
        int count=0;
        for (int i = 1; i<20210; i++) {
            String str=i+"";
            for (int j = 0; j <str.length(); j++) {
                if(str.charAt(j)=='1')
                {
                    count++;
                }
                if (count==2021){
                    System.out.println(str);
                    break;
                }

            }
        }
    }
    public static void main23(String[] args) {
        int count=0;
        for (int i = 2; i < 20000; i++) {
            boolean flag=true;
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
            if (count==2){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main22(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int score=0;
        int sum=0;
        int tem=n;
        int count60=0 ,count85=0;
        while(n-->0){
            score= scanner.nextInt();
            if (score>=60&&score<85){
                count60++;
            }
            else if (score>=85&&score<=100){
                count85++;
            }
        }
        System.out.println((int)count60*1.0/tem*100+"%");
        System.out.println((int)count85*1.0/tem*100+"%");


    }
    public static void main21(String[] args) {
        //计算字符串中重复元素个数
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        int[] ints = new int[26];
        for (int i = 0; i < str.length(); i++) {
            ints[str.charAt(i)-'a']++;
        }
        int max=0;
        char ch='a';
        for (int i = 0; i < 26; i++) {
            if(ints[i]>max){
                max=ints[i];
                 ch=(char)(i+'a');
            }
        }
        System.out.println(max);
        System.out.println(ch);
    }
    public static void main20(String[] args) {
        //双指针--找出数组两个数的和等于target
        int[] nums={1,2,3,5,8,10};
        int target=5;
        int begin=0;
        int end= nums.length-1;
        while(true){
            if(nums[begin]+nums[end]==target){
                System.out.println(begin+" "+end);
                break;
            } else if (nums[begin]+nums[end]>target) {
                end--;//加起来大了 --去找小的
            } else if (nums[begin]+nums[end]<target) {
                begin++;//加起来小了 ++去找大的
            }
        }
    }
    public static void main19(String[] args) {
        //二分查找，target不在就放进去返回当前索引
        int[] nums={1,3,5,6,9};
        int target=2;
        int left=0;
        int right = nums.length-1;
        while(left<=right){
            int mid=(left+right)>>>1;
            if(nums[mid]>target){
                right=mid-1;
            } else if (nums[mid]<target) {
                left=mid+1;
            }
            else {
                System.out.println(mid);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>target){
                System.out.println(i);
                break;
            }
        }

    }
    public static void main18(String[] args) {
        //找出数组重复元素
        int[] nums={1,2,2,1,3};
        HashSet<Object> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if (!hashSet.add(nums[i])){
                System.out.println(nums[i]);
            }
        }
    }
    public static void main17(String[] args) {
        //前缀和--查找数组中心下标
        int[] nums={1,2,3,4,7};
        int sumR=Arrays.stream(nums).sum();
        int sumL=0;
        for (int i = 0; i < nums.length; i++) {
            sumR=sumR-nums[i];//i位置不不参与运算。需要将i位置值排除在于sumleft比较
            if(sumL==sumR){
                System.out.println(i);
            }
            sumL=sumL+nums[i];
        }

    }
    public static void main16(String[] args) {
        //移除非字母后判断是否回文
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
//        StringBuilder reve=stringBuilder.reverse();//err此时的stringBuilder已经被翻转 后面怎么equal都是true
        StringBuilder reve=new StringBuilder(stringBuilder).reverse();
        System.out.println(reve.toString().equals(stringBuilder.toString()));
    }
    public static void main15(String[] args) {
        int[] arr={1,4,2,5,3};
        //奇数个元素之和
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
