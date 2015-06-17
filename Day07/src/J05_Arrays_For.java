
public class J05_Arrays_For {
	public static void main(String[] args) {
		
		int[] data = new int[3];
		data[0] = 1;
		data[1] = 2;
		data[2] = 3;
		
		
		int i;
		i=0;
			System.out.println(data[i]);
		i=1;
			System.out.println(data[i]);
		i=2;
			System.out.println(data[i]);
		
		for(int k=0; k<3; k++) {
			System.out.println(data[k]);
		}
			
		
//		.length 명령
//		- 배열의 공간 갯수를 제공하는 명령
//		- int 형태로 제공한다.
		int n = data.length;
		System.out.println(
			"data 배열의 공간 갯수 : " + n);
		
		for(int k=0; k<data.length; k++) {
			System.out.println(
					"출력 : " + data[k]);
		}
	}
}










