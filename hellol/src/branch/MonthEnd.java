/**
 * 
 */
package branch;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;

/**
 * @date   :2016. 6. 9. 
 * @author :주현호
 * @file   :MonthEnd.java
 * @story  :
*/
public class MonthEnd {
	/**
	 * 월을 입력하면 말일이 몇일인지 알려주는
	 * 프로그램.
	 * 단, 2월은 29일로 한정함.
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력값입니다 라고 뜬다.
	 * */
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int wol=0 , malil=0; 
	System.out.println("월?");
	wol=scanner.nextInt();
	switch (wol) {
	case 1:
		malil = 31;
		break;
	case 3:
		malil = 31;
		break;
	case 5:
		malil = 31;
		break;
	case 7:
		malil = 31;
		break;
	case 8:
		malil = 31;
		break;
	case 10:
		malil = 31;
		break;
	case 12:
		malil = 31;
		break;
	case 4:
		malil = 30;
		break;
	case 6:
		malil = 30;
		break;
	case 9:
		malil = 30;
		break;
	case 11:
		malil = 30;
		break;
	case 2:
		malil = 29;
		break;










	

	default:System.out.println("잘못 입력 되었습니다");
		return;
		
	}
	System.out.println(wol+"월"+malil+"일");
	
	}

}
