package homework;
//변수선언
public class Java47p_2_7_10 {

	public static void main(String[] args) {
		//예제2-7
		
		int studentAge; //학생의 나이를 저장할 수 있는 변수선언
		studentAge = 20; //변수의 값을 대입(저장)
		
		System.out.println(studentAge);

		
		System.out.println();
		//변수선언 및 초기화
		
		String myCity = "seoul"; //도시를 저장할 수 있는 변수를 선언하고, 변수에 "seoul"대입
		
		System.out.println("I am from " + myCity);
		
		System.out.println();
		
		//예제2-9
//		
//		int myAge = 20; //나이를 저장할 수 있는 변수를 선언하고 다른 변수에 복사
//		int yourAge = myAge;
//		
//		System.out.println(myAge);
//		System.out.println(yourAge);
//		
		System.out.println();
		
		//예제2-10
		
		int myAge = 20; //변수선언
		int yourAge = 30;
		int tempAge ;
		
		tempAge = myAge; //myAge에 저장된 데이터를 tempAge에 복사
		myAge = yourAge; //myAge에 yourAge의 데이터를 복사
		yourAge = tempAge; //tempAge에 저장해둔 myAge의 데이터를 yourAge에 저장
		
		System.out.println(myAge);
		System.out.println(yourAge);
		
		
		
		
	}

}
