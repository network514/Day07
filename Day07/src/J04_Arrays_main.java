
public class J04_Arrays_main {
	public static void main(String[] args) {
		
//		정수 10, 20, 30을 처리하는 프로그램
		
//		1. 일반자료형 이용한 프로그램
//		- int 변수선언 3번 필요
		int a;
		int b;
		int c;
		
		a = 10;
		b = 20;
		c = 30;
		
		
//		2. 자바가 가진 배열의 의미
		J04_intro arrays = new J04_intro();
		
		arrays.index0 = 10;
		arrays.index1 = 20;
		arrays.index2 = 30;
		
		
//		3. 자바의 배열 사용 - int 배열
		int[] ref = new int[3];
//		=> 정수 3개에 대한 배열 구조를 
//			가지고 있는 집을 new가 지은 후,
//			집의 공유번호를 프로그램 영역 제공함
//		=> 제공된 공유번호를 레퍼런스 변수 ref에
//			저장하는 작업인데,
//			int[] ref; 는 ref가 언급(참조)하는 
//			객체 대상이 int배열에 대한 객체라는
//			의미이다.
//		=> new가 만든 집 안의 배열은 
//			각각의 공간번호를 가지는데,
//			모든 배열의 시작 공간번호는 0이다.
		
		
		ref[0] = 10;
		ref[1] = 20;
		ref[2] = 30;
//		=> ref는 레퍼런스 변수이기 때문에
//			참조연산자(.)이 필요하지만,
//			배열구조를 가지고 있는 객체에 대한
//			레퍼런스이므로 []를 사용할 수 있다.
//		=> []는 참조연산자가 숨겨진 형태이다.
//		=> []안에 배열의 공간번호만 명시하면
//			원하는 배열 공간을 이용할 수 있다.

		System.out.println("0번 방 : " 
								+ ref[0]);
		System.out.println("1번 방 : "
								+ ref[1]);
		System.out.println("2번 방 : "
								+ ref[2]);
		
		
//		문제 : 실수 1.1, 2.2, 3.3, 4.4를
//			배열 구조로 처리하는 프로그램 작성
//			- 위의 데이터를 저장 후 출력하세요
		
//		1. float 방법
		float[] ff = new float[4];
		ff[0] = 1.1f;
		ff[1] = 2.2f;
		ff[2] = 3.3f;
		ff[3] = 4.4f;
		System.out.println(ff[0] + ", "
				+ ff[1] + ", " + ff[2]
				+ ", " + ff[3]);
		
//		2. double 방법
		double[] dd = new double[4];
		dd[0] = 1.1;
		dd[1] = 2.2;
		dd[2] = 3.3;
		dd[3] = 4.4;
		System.out.println(dd[0] + ", "
				+ dd[1] + ", " + dd[2]
				+ ", " + dd[3]);
		
	}
}





