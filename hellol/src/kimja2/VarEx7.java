package kimja2;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8. 
 * @author :주현호
 * @file   :VarEx7.java
 * @story  :실수탑 double 더하기 예제
*/
public class VarEx7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x=0,y=0,z=0;
		System.out.println("실수x[  ]");
		x = scanner.nextDouble();
		System.out.println("실수y[  ]");
		y = scanner.nextDouble();
		z = x + y;
		System.out.println("x+y:"+z);
	}

}
