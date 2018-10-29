package goong;

public class Student {
	String name;
	int classNo;
	int studentNo;
	int Korean;
	int Math;
	int English;
	int Total;
	
	Student(){}
	Student(String in_Name, int in_ClassNo, int in_studentNo, int in_Korean, int in_Math, int in_English){
		name = in_Name;
		classNo = in_ClassNo;
		studentNo = in_studentNo;
		Korean = in_Korean;
		Math = in_Math;
		English = in_English;
		Total = in_Korean + in_Math + in_English;
	}
	public String toString(	String name, int classNo, int studentNo, int Korean, int Math, int English,	int Total){
		String str = name + "\t" + classNo + "\t" + studentNo + "\t" + Korean + "\t" + Math + "\t" + English + "\t" + Total;
		return str;
	}
    /*

         코드를 완성하세요.

         1.  이름(name), 반(classNo), 번호(studentNo),

             국어, 수학(Math), 영어(English), 총점(Total)을

             인스턴스변수로 선언한다.

         2. 이름, 반, 번호, 국어, 수학, 영어를 입력받아서 각 인스턴스변수에 저장하는

             생성자를 선언한다.

         3. Object클래스의 toString()을 오버라이딩해서 실행결과와 같이,

             이름, 반, 번호, 국어, 수학, 영어, 총점이 화면에 출력되도록 한다.

     */

}
