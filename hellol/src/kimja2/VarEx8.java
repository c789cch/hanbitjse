package kimja2;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8. 
 * @author :주현호
 * @file   :VarEx8.java
 * @story  :실수탑 double 더하기 예제
*/
public class VarEx8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("실수 x :");
		double x = scanner.nextDouble();
		System.out.println("실수 y :");
		double y = scanner.nextDouble();
		double z = x / y;
		System.out.println("x / y :"+z);
		
	}

}
