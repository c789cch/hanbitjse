/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8. 
 * @author :주현호
 * @file   :Tax4.java
 * @story  :
*/
public class Tax4 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 KOR,ONG,MATH 세과목점수를 입력받아서
	 * [홍길동 : 총점 100점, 평균50점]
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 :");
		String name = scanner.next();
		System.out.println("KOR,ONG,MATH :");
		int sal = scanner.nextInt();
		double tax = scanner.nextDouble();
		int z = (int) (sal * tax);
		System.out.println("[홍길동 : 총점 100점, 평균50점]");
	}

}
