/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9. 
 * @author :주현호
 * @file   :avg3.java
 * @story  :
*/
public class avg {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균***점,학점 : F],
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점이하는 절삭합니다.
	 * 평균점수가 90점 이상 A
	 * 80점 이상이면 B
	 * 70점 이상이면 C
	 * 60점 이상이면 D
	 * 50점 이상이면 E
	 * 50점 미만이면 F 학점입니다라고
	 * 출력되게 해주세요
	 */
	public static void main(String[] args) {
		String name="",jhh="";
		int total=0 , avg=0 , kor=0 , eng=0 , math=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("name :");
		name = scanner.next();
		System.out.println("국,영,수 :");
		kor=scanner.nextInt();
		if (kor >= 101 || kor<0) {
		System.out.println("0에서 100까지 입력해주세요");
		return;
		}
		eng=scanner.nextInt();
		if (eng >= 101 || eng<0) {
			System.out.println("0에서 100까지 입력해주세요");
			return;
			
		}
		math=scanner.nextInt();
		if (math >= 101 || math<0) {
			System.out.println("");
		}
		total=kor+eng+math;
		avg = total / 3;
		
		}			
		
		
		
	}


