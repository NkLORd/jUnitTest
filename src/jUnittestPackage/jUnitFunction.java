package jUnittestPackage;
import java.util.*;
public class jUnitFunction {
	
public int sumnum(int a, int b) {
		
		int sum = a + b;
		return sum;
		
	}
	
public String sumstr(String a, String b) {
		String c = a + b;
		return c;
	}
	
	public static void main(String nk[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		
		jUnitFunction obj = new jUnitFunction();
		System.out.println("The sum of numbers are : "+obj.sumnum(a, b));
		System.out.println("The sum of strings are : "+obj.sumstr(s1, s2));
		
	}

}
