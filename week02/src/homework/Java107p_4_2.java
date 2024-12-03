package homework;

import java.util.Scanner;

public class Java107p_4_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("나이를 입력하세요.");
	
	int age = sc.nextInt();
	if(age > 19) {
		System.out.println("성인입니다");
		
	}
	System.out.println("프로그램을 종료합니다");
}
}
