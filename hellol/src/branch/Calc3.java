/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9. 
 * @author :주현호
 * @file   :Calc2.java
 * @story  :
*/
/*
 * 두개의 정수를 입력받아서
 * opcode 값이 1이면 덧셈
 * 2면 뺄셈
 * 3이면 곱셈
 * 4면 나눗셈(몫)
 * 5면 나머지 구하는 계산기
 */
public class Calc3 {
	public static void main(String[] args) {
		//-----------init---------------
		Scanner scan = new Scanner(System.in);
		int num1=0 , num2=0 ,numResult=0;
		String symbol="",count="";
		//----------op---------------------
		System.out.println("첫번째숫자 : ");
		num1 = scan.nextInt();
		System.out.println("연산자 : ");
		count = scan.next();
		System.out.println("두번째숫자 :");
		num2 = scan.nextInt();
		switch (count) {
		case "+":
			symbol = "+";
			numResult= num1+num2;
			break;
		case "-":
			symbol = "-";
			numResult= num1-num2;
			break;
		case "*":
			symbol = "*";
		numResult= num1*num2;
			break;
		case "/":symbol = "/";
		numResult= num1/num2;
			break;
		case "%":symbol = "%";
		numResult= num1%num2;
			break;
		default:
			System.out.println("1~5까지만 입력바랍니다");
			return;
			
		}
		//------------out-------------
		System.out.println(num1+num2+symbol+numResult);
	}
}
		