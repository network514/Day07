import javax.swing.JOptionPane;


public class J03_Ans_main {
	public static void main(String[] args) {
		
//		1. 데이터 저장 공간 확보
		J03_Stu ss = new J03_Stu();
		
		String showMenu = 
			"1. 학생 정보 입력\n"
			+ "2. 학생 정보 출력\n"
			+ "3. 프로그램 종료\n\n"
			+ "번호 선택";
		
		area : while(true) {
			
			String menu = 
			JOptionPane.showInputDialog(
							  showMenu);
			String msg = null;
			
			switch(menu) {
			case "1" : 
				ss.name = 
				JOptionPane.showInputDialog(
						"이름 입력");
				
				String k = 
				JOptionPane.showInputDialog(
						"국어 점수 입력");
				ss.kor = Integer.parseInt(k);
				
				String e = 
				JOptionPane.showInputDialog(
						"영어 점수 입력");
				ss.eng = Integer.parseInt(e);
				
				String m =
				JOptionPane.showInputDialog(
						"수학 점수 입력");
				ss.math = Integer.parseInt(m);
				
				ss.sum
					= ss.kor + ss.eng + ss.math;
				ss.avg = ss.sum / 3.0;
				
				if(ss.avg >= 90) {
					ss.grade = "수";
				} else if(ss.avg >= 80) {
					ss.grade = "우";
				} else if(ss.avg >= 70) {
					ss.grade = "미";
				} else if(ss.avg >= 60) {
					ss.grade = "양";
				} else {
					ss.grade = "가";
				}
				
				msg = "정상적으로 저장되었습니다.";
				
				break;
				
			case "2" : 
				msg = ss.name + "학생정보\n\n"
				 + "국어점수 : " + ss.kor + "\n"
				 + "영어점수 : " + ss.eng + "\n"
				 + "수학점수 : " + ss.math + "\n"
				 + "총점 : " + ss.sum + "\n"
				 + "평균 : " + ss.avg + "\n"
				 + "등급 : " + ss.grade;
				break;
				
			case "3" :
				break area;
				
				default : 
					msg = "잘못된 입력입니다.";
			}
			JOptionPane.showMessageDialog(
								null, msg);
		}
	}
}










