import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


@SuppressWarnings({"all"})
public class OJlanqiao {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        String[] arr=str.split(" ");

    }
    public static void main68(String[] args) {
        HashSet hashSet = new HashSet();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int m= scanner.nextInt();
            hashSet.add(m);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
    public static void main66(String[] args) {
        //汉诺塔问题n个塔就是2^n-1
        BigInteger bigInteger = new BigInteger("2");
        bigInteger=bigInteger.pow(64).subtract(new BigInteger("1"));
        System.out.println(bigInteger);
        System.out.println("18446744073709551615");
    }
    public static void main6666(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int[][] ab = new int[n + 1][2];
        for (int i = 1; i < n+1; i++) {
            ab[i][0]= scanner.nextInt();
            ab[i][1]= scanner.nextInt();
        }
        //常规算法
        for (int i = 100000; i >=1 ; i--) {
            //此边长下下面能不能切出k块 不能count重置
            int count=0;
            for (int j = 1; j <= n; j++) {
                count=count+(ab[j][0]/i)*(ab[j][1]/i);
            }
            if (count>=k){
                System.out.println(i);
                break;
            }
        }
        //二分
        int l=1;
        int r=100000;
        int ret=0;
        while(l<=r){
            int mid=(l+r)>>>1;
            int count=0;
            for (int i = 1; i <= n; i++) {
                count=count+(ab[i][0]/mid)*(ab[i][1]/mid);
            }
            if (count>=k){
                //比他大 可以往右使使劲
                l=mid+1;
                ret=mid;
            }

            else r=mid-1;
        }
        System.out.println(ret);
    }
    static boolean qiaokeli(int[][] ab,int mid,int n,int k){

        return false;
    }
    public static void main25(String[] args) {
        int fz=1;
        int fm=1;
        for (int i = 1; i < 20; i++) {
            fm=fm*2;
            fz=fm+fz;
        }
        System.out.println(fz+"/"+fm);
    }
    public static void main24(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n= scanner.nextInt();
        long count=n;
        while(n>3){
            count=count+n/3;
            n=n/3+n%3;
        }
        System.out.println(count);
    }
    public static void main23(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i]= scanner.nextInt();
        }
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(0);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList(hashSet);
            for (int k :list) {
                hashSet.add(g[i]+k);
                hashSet.add(Math.abs(g[i]-k));
            }
        }
        hashSet.remove((Object) 0);
        System.out.println(hashSet.size());
    }
    public static void main22(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < 3; i++) {
            arr[i][0]= scanner.nextInt();
            arr[i][1]= scanner.nextInt();
            arr[i][2]= scanner.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]+o1[1]+o1[2]-o2[0]-o2[1]-o2[2];
            }
        });
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
                if (j == 1) {
                    ans = ans + sum;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main21(String[] args) {
        Long aLong = new Long("2021041820210418");
        HashSet<Long> hashSet = new HashSet();
        for (long i = 1; i*i*i<=aLong ; i++) {
            if (aLong%i==0){
                hashSet.add(i);
                hashSet.add((aLong/i));
                hashSet.add(aLong/i/i);
            }
        }
        int count=0;
        for (long l :hashSet) {
            for (long l1 :hashSet) {
                for (long l2 :hashSet) {
                    if (l*l1*l2==aLong){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main20(String[] args) {
        int n=new Scanner(System.in).nextInt();
        if (n<=2) System.out.println(1);
        else if (n>2&&n<=4) System.out.println(2);
        else if (n==5) System.out.println(3);
        else if (n==6) System.out.println(4);
        else if(n==7) System.out.println(6);
        else if(n==8) System.out.println(7);
        else if(n>=9) System.out.println(8);
    }
    public static void main19(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <=10 ; i++) {
            list.add(i);
        }
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < ints.length ; i++) {
            ints[i]= scanner.nextInt();
        }
        for (int i = 0; i < ints.length; i++) {
            list.remove((Integer) ints[i]);
            list.addFirst(ints[i]);
            for (int j = 0; j <10 ; j++) {
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main18(String[] args) {
        //冒泡最小字典序
        Scanner scanner = new Scanner(System.in);
        String str="gfedcba";
        int count=0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    count++;
                    char t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
    public static void main16(String[] args) {
        String rs="2022";
        System.out.println(Integer.parseInt("11",2));
    }
    public static void main15(String[] args) {
        for(int i = 1;;i++){
            int b = i;
            if(b % 5 == 1){
                b = (b-1)/5*4;
                if(b % 5 ==2){
                    b = (b-2)/5*4;
                    if(b % 5 == 3){
                        b = (b-3)/5*4;
                        if(b % 5 == 4){
                            b = (b-4)/5*4;
                            if(b % 5 == 0 && b >= 5){
                                System.out.println(i);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        int sum=arr[0];
        int ret=0;
        for (int i = 1; i < arr.length ; i++) {
            sum=sum+arr[i];
            ret=ret+sum;
        }
        System.out.println(ret);
    }
    public static void main13(String[] args) {
        int[] arr = new int[40];
        arr[0]=1;
        arr[1]=3;
        arr[2]=4;
        arr[3]=7;
        for (int i = 4; i <40 ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < 39; i++) {
            if ((double) arr[i] / arr[i+1] >= 0.6180335 && (double) arr[i] / arr[i+1] < 0.6180345) {
                System.out.println(arr[i]+"/"+arr[i+1]);
                break;
            }
        }
    }
    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        /*
        n==1  1
           2  1 3(尽量大)
           3  1 3
           4  1 3
           5  1 3 9
           6  1 3 9
           7  1 3 9
           8  1 3 9
           9  1 3 9
           10 1 3 9
           11 1 3 9
           12 1 3 9
           13 1 3 9
         */
        int count=0;
        int sum=0;
        for (int i = 1;  ; i=i*3) {
            sum=sum+i;
            count++;
            if (sum>=n){
                System.out.println(count);
                return;
            }
        }
    }
    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[][] map = new int[n + 2][m + 2];
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                map[i][j]= scanner.nextInt();
            }
        }
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if (map[i][j]==1){
                    map[i][j]=9;
                    System.out.print(map[i][j]+" ");
                    map[i][j]=1;
                }
                else {
                    map[i][j]=map[i][j+1]+map[i][j-1]+map[i-1][j-1]+map[i-1][j]+map[i-1][j+1]+map[i+1][j]+map[i+1][j+1]+map[i+1][j-1];
                    System.out.print(map[i][j]+" ");
                    map[i][j]=0;

                }
            }
            System.out.println();
        }

    }
    public static void main10(String[] args) {
        int count=0;
        for (int i = 1; i <2021 ; i++) {
            if(i%4==0&&i%6==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean is2019(int n){
        while(n>0){
            if(n%10==2||n%10==0||n%10==1||n%10==9){
                return true;
            }
            n/=10;
        }
        return false;
    }
    public static void main9(String[] args) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <=2019 ; i++) {
            if (is2019(i)){
                bigInteger=bigInteger.add(new BigInteger(i*i+""));
            }
        }
        System.out.println(bigInteger);
    }
    public static boolean isSingle(int n){
        while(n>0){
            if (n%2==0){
                return false;
            }
            n/=10;
        }
        return  true;
    }
    public static void main8(String[] args) {
        for (int i = 2019;  ; i+=2019) {
            if (!isSingle(i)){
                continue;
            }
            System.out.println(i);
            break;
        }
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[][] arr = new int[n+1][m+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }
        int max=Integer.MAX_VALUE;
        int sum=arr[1][1];
        int[] x={0,0,0,-1,-1,-1,-2,-2,-3};
        int[] y={-3,-2,-1,-2,-1,0,-1,0,0};
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                for (int k = 0; k < 9; k++) {
                    if (i+x[k]>=1&&j+y[k]>=1){
                        max=Math.max(max,arr[i+x[k]][j+y[k]]);
                    }
                }
                if (max!=Integer.MAX_VALUE){
                    sum=sum+max;
                }
            }
        }
        System.out.println(sum);
    }
    public static int Oujilide(int m,int n){
        if (n==0){
            //余数为零时，m就是最大公约数
            return m;
        }
        else {
            return Oujilide(n,m%n);
        }
    }
    public static void main6(String[] args) {
        int count=0;
        for (int i = 1; i <=2020 ; i++) {
            for (int j = 1; j <=2020 ; j++) {
                if(Oujilide(i,j)==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main5(String[] args) {
        int sum=0;
        for (int i = 1; i <=2019 ; i++) {
            int t=i;
            while(t>0){
                if (t%10==2||t%10==0||t%10==1||t%10==9){
                    sum+=i;
                    break;
                }
                t/=10;
            }
        }
        System.out.println(sum);
    }
    public static void main4(String[] args) {
        HashSet hashSet = new HashSet();
        int count=0;
        for (int i = 123; i <988 ; i++) {
            for (int j = 123; j <988 ; j++) {
                int t=i+j;
                if (t<1000){
                    String str=""+i+j+t;
                    for (int k = 0; k < str.length(); k++) {
                        hashSet.add(str.charAt(k));
                    }
                    if (hashSet.size()==9&& (!hashSet.contains('0'))){
                        count++;
                    }
                    hashSet.clear();
                }
            }
        }
        System.out.println(count);
    }
    public static void main3(String[] args) {
        //杨辉三角
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        Integer[][] arr = new Integer[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i][0]=1;
            arr[i][i]=1;
            if (i>1){
                for (int j = 1; j < i; j++) {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];

                }
            }
        }
        int count=0;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                if (arr[i][j]==n){
                    System.out.println(count);
                    return ;
                }
            }
        }

    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chars = new char[30][50];
        int count=0;
        for (int i = 0; i < 30; i++) {
            chars[i]=scanner.nextLine().toCharArray();
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 50; j++) {
                //左->右
                for (int k = j+1; k <50 ; k++) {
                    if (chars[i][j]<chars[i][k]){
                        count++;
                    }
                }
                //上->下
                for (int k = i+1; k <30 ; k++) {
                    if (chars[i][j]<chars[i][k]){
                        count++;
                    }
                }
                //左上->右下
                for (int x=i+1,y=j+1;x<30&&y<50;x++,y++) {
                    if (chars[i][j]<chars[x][y]){
                        count++;
                    }
                }
                //左下->右上
                for (int x=29,y=j+1;x>=0&&y<50;x--,y++) {
                    if (chars[i][j]<chars[x][y]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(51435);
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i <=n/i; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) {
        int count=0;
        for (int i = 2; i <=2019 ; i++) {
            int j=2019-i;
            if(isPrime(i)&&isPrime(j)){
                count++;
            }
        }
        System.out.println(count/2);
    }
    public static void main0(String[] args) {
        BigInteger b0 = new BigInteger("1");
        BigInteger b1 = new BigInteger("1");
        for (int i = 2; i <=64 ; i++) {
            b1=b1.multiply(new BigInteger("2"));
            b0=b0.add(b1);
        }
        System.out.println(b0);
    }
}
