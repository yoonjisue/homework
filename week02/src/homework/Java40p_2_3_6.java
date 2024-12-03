package homework;
//서식문자를 이용해 출력하기 
public class Java40p_2_3_6 {

	public static void main(String[] args) {
		
		//예제2-3
		System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3);
		
		//예제2-4
		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째.",1 , 2.0, "셋");
		
		System.out.println();
		
		//예제2-5
		System.out.printf("%5d", 1);
		System.out.println(); //줄바꿈
		System.out.printf("%5d", 12);
		System.out.println();
		System.out.printf("%5d", 123);
		System.out.println();
		System.out.printf("%5d", 1234);
		System.out.println();
		System.out.printf("%5d", 12345);
		System.out.println();
		
		System.out.println();

		//예제2-6
		System.out.printf("%.1f", 1.1234567);
		System.out.println();
		System.out.printf("%.2f", 1.1234567);
		System.out.println();
		System.out.printf("%.3f", 1.1234567);
		System.out.println();
		System.out.printf("%.4f", 1.1234567);
		System.out.println();
		System.out.printf("%.5f", 1.1234567);
		System.out.println();
		
	}

}
