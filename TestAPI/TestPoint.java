
package TestAPI;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.awt.font.FontRenderContext;
import java.util.Random ;


public class TestPoint {
	public static String getName(String s) {
//		for (int i = 0; i < s.length(); i++) {
//			if(s.charAt(i)=='@')  {
//				return s.substring(0, i);
//			}
//		}
//		return "\0";
		s=s.trim();
		int index=s.indexOf("@");
		if(index==-1) {
			return "err";
		}
		return s.substring(0, index);
	}
	public static boolean ishuiwen(String str) {
		String cur=str.trim();
		for(int i=0, j=cur.length()-1;i<j;i++,j--) {
			if(cur.charAt(i)!=cur.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		StringBuffer sb2=new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for(int i=0;i<5;i++) {
			int j=new Random().nextInt(26);
			char t=sb1.charAt(i);
			sb1.setCharAt(i,sb1.charAt(j));
			sb1.setCharAt(j, t);
			
		}
		String ret=sb1.substring(0, 5);
		System.out.println(ret);
		for(int i=0;i<5;i++) {
			int j=new Random().nextInt(26);
			char t=sb2.charAt(i);
			sb2.setCharAt(i,sb2.charAt(j));
			sb2.setCharAt(j, t);
			
		}
		String ret2=sb2.substring(0, 5);
		System.out.println(ret2);
		int a=0,b=0;
		for (int i = 0; i < sb1.length(); i++) {
			for (int j = 0; j < sb2.length(); j++) {
				if(sb1.charAt(i)==sb2.charAt(j))
					if(i==j) {
						a++;
					}
					else {
						b++;
					}
				break;
			}
		}
		System.out.println(a+"a"+b+"b");
	}
	public static void main10(String[] args) {
		int[] array1=new int[] {0,1,2,3,4,5,6,7,8,9};
		int[] array2=new int[10];
		System.arraycopy(array1, 1, array2, 2, 4);
		for(int x:array2) {
			System.out.print(x);
		}
	}
	public static void main9(String[] args) {
		//StringBuffer append deleteCharAt delete insert setCharAt replace reverse
		StringBuffer sb=new StringBuffer("xxxxxxoooooooo");
		sb.append("xxxooo");
		System.out.println(sb);
		sb.insert(1, "XXXOOO");
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		sb.setCharAt(1, 'X');
		System.out.println(sb);
		sb.replace(1, 2, "XXXX");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		 
	}
	public static void main8(String[] args) {
		StringBuilder sb=new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for(int i=0;i<5;i++) {
			int j=new Random().nextInt(26);
			char t=sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j, t);
			
		}
		String ret=sb.substring(0, 5);
		System.out.println(ret);
	}
	public static void main7(String[] args) {
		System.out.println("????????????????????");
		Scanner sc	= new Scanner(System.in);
		String str=sc.nextLine();
		String regex="\\d{17}[\\dxX]";
		if(str.matches(regex)) {
			System.out.println("????????");
		}
		else {
			System.out.println("????????");
		}
	}
	public static void main6(String[] args) {
		String str0="abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<2;i++)
			sb.append(str0);
		System.out.println(sb);
		
	}
	public static void main5(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		boolean ret=ishuiwen(str);
		if(ret) {
			System.out.println("??????");
		}
		else {
			System.out.println("????????");
		}
		
	}
	public static void main4(String[] args) {
		String str2="    abcoocdeoofghoo   ";
		System.out.println(str2.indexOf("oo"));
		System.out.println(str2.indexOf("ooo"));//-1
		System.out.println(str2.trim());
		System.out.println(str2.replace("oo", "mm"));
		String[] arrstr=str2.split("oo");
		for(String s:arrstr) {
			System.out.println(s);
		}
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toCharArray());
		String str3="123456789";
		System.out.println(str3.valueOf(str3));
	}
	public static void main3(String[] args) {
		System.out.println("??????????Email??");
		String str = new Scanner(System.in).next();
		String s = getName(str);
		System.out.println(s);
	}

	public static void main2(String[] args) {
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = " ";
		long t = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str2 = str2 + str1;
		}
		t = System.currentTimeMillis() - t;

		System.out.println(t);
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(3, 4);
		Point point2 = new Point(3, 4);
		System.out.println(point1.toString());
		System.out.println(point2.toString());
		System.out.println(point1 == point2);
		System.out.println(point1.equals(point2));// this(point1)==point2 ??????????????????????????
	}

}
