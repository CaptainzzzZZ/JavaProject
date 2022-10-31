
package TestAPI;

import java.util.Scanner;

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

	public static void main(String[] args) {
		System.out.println("请输入一个Email：");
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
		System.out.println(point1.equals(point2));// this(point1)==point2 也是比较的的两个对象的引用
	}

}
