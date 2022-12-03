import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lanqiao2 {
    public static boolean isHui(String str){
        int i=0;
        int j=0;
        for (i=0,j=str.length()-1; i <=j ; i++,j--) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        char[][] arr=new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.next().toCharArray();
        }

    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    sum=sum+arr[j];
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println(sum);
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        if(isHui(str)){
            System.out.println(str);
            return ;
        }
        String str1="";
        for (int i = str.length()-2; i >=0 ; i--) {
            str1=str1+str.charAt(i);
        }
        System.out.println(str+str1);
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        int n= scanner.nextInt();
        int t=n;
        while(t-->=0) {
            arrayList.add(new String(scanner.nextLine()));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size() ; j++) {
                if(arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    public static void main4(String[] args) {
        int t,c,s;
        Scanner scanner = new Scanner(System.in);
        t= scanner.nextInt();
        c= scanner.nextInt();
        s= scanner.nextInt();
        System.out.println((int)(s/(double)(c/(double)t))-t);

    }
    public static void main3(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        int count;
        for (int i = 2; i <2022 ; i++) {
            for (int j = 2; j <i ; j++) {

            }
        }

    }
    public static void main2(String[] args) {
        for (int i = 10; i < 2000; i++) {
            String str=String.valueOf(i);
            int t=Integer.parseInt(str,16);
            int t2=Integer.parseInt(str);
            if(t%t2==0){
                System.out.println("i="+i+"   "+t/t2);
            }

        }
    }
    public static void main1(String[] args)throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String t1= "1949-10-1";
        String t2= "2022-1-1";
        Date d1=simpleDateFormat.parse(t1);
        Date d2=simpleDateFormat.parse(t2);
        long T1=System.currentTimeMillis()- d1.getTime();
        long T2=System.currentTimeMillis()- d2.getTime();
        System.out.println((T1-T2)/1000/60/60/24);

    }
}
