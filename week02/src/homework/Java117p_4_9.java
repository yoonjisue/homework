package homework;

import java.util.Scanner;

public class Java117p_4_9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("나이를 입력하세요.");
	int age = sc.nextInt();
	if(age > 19) {
		System.out.println("성인입니다");
	} else if(age > 13) {
		System.out.println("청소년입니다");
	} else if(age > 6) {
		System.out.println("어린이입니다");
	} else {
		System.out.println("유아입니다");
		
	}
}
}
