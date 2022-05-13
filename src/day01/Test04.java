package day01;

public class Test04 {

	public static void main(String[] args) {
		
	/* 변수: 데이터를 저장할 수 있는 공간
		변수에는 자료형 지정이 필수적
		
		bit: 이진수의 한 자리는 1bit
		8bit = 1byte
		
		자료형(type)의 종류
		1. byte		1byte	-128 ~ 127
		2. short	2byte	-32768 ~ 32767
		3. char		2byte	0 ~ 65535
		4. int		4byte
		5. float	4byte
		6. double	8byte
		7. void		값을 갖지 않는 특수한 데이터형
		
	*/
		//자료형 변수이름 = 변수 값
		int age = 40; // int: 정수 표현
		double weight = 65.3; //실수 표현
		double height = 177.3; //실수 표현
		
		System.out.println("박유덕씨는 " + age + "살");
		System.out.println(height + "cm" + "래요");
		System.out.println("몸무게는 " + weight + "kg" + "는 아닐텐데 걍 넣어봄");
		
		// char는 문자 하나만 표현 할 때 사용
		// 문자 하나는 작은 따옴표로 표현
		 char ch = 'A'; //변수 선언: 초기화 과정
		 System.out.println("변경 전: " + ch);
		 ch = 'B';
		 System.out.println("변경 후: " + ch);
		 
		 System.out.println("연산: " + (ch+32));
		 
		 //형변환
		 System.out.println("연산: " + (char)(ch+32));
		 System.out.println("연산: " + (double)(ch+32));
		 
		 System.out.println(1.111);
		 System.out.println((int)1.111);
		 
		 String name = "박유덕";
		 System.out.println(name+ "님 안녕하세요.");
		 name = "박정원";
		 System.out.println("이름 변경: " + name);
		
	}

}
