
public class J01_mainCla {
	public static void main(String[] args) {
		
//		자동차 - 이름, 가격, 최고속도
		
//		1. 클래스 설계도 만들기
		
//		2. 완성된 클래스 설계도로 집 짓기
		new J01_Car();
		
//		=> 작성한 J01_Car 설계도를 전담하는
//			일꾼을 통해서 집을 지으라는 의미.
//		- new라는 키워드가 J01_Car설계도를
//			전담하는 일꾼인 J01_Car()에게
//			명령하여 집을 짓는 작업
//		- new는 집을 지은 후,
//			집에 대한 공유번호를 프로그램 영역에
//			제공하는데, 제공되는 고유번호를 
//			받아서 저장하지 않으면
//			자바의 가비지컬렉터가 집을 삭제한다.
//		- 따라서, 지어진 집을 프로그램에서
//			계속적으로 이용하고 싶은 경우
//			제공되는 고유번호를 변수에 저장할'
//			필요가 있는데, 이 때 사용되는 변수를
//			레퍼런스 변수라 한다.
//		- 완선된 집은 객체 또는 인스턴스라고 부른다.
		
		
//		3. 레퍼런스
		J01_Car ref;
		
//		=> ref라는 종이를 만드는데,
//			이 종이는 J01_Car 객체에 대해
//			언급(참조, reference)하는 역할을
//			한다는 의미
		
//		System.out.println("ref : " + ref);
//		=> 저장된 고유번호가 없기 때문에 이용
//			불가능
		
		ref = new J01_Car();
		System.out.println("ref = " + ref);
		
		
//		4. 참조연산자(.)
		ref.name = "슈퍼카";
		ref.price = 100;
		ref.maxPrice = 200;
		
		System.out.println(ref.name
				+ "의 가격은 " + ref.price
				+ "원이고, 최고속도는 "
				+ ref.maxPrice + "km/h입니다.");
		
		
	}
}














