package homework;

import java.util.Scanner;

public class Java73p_2_30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name, address;
		int age;
		double weight;
		
		System.out.println("이름,주소,나이,체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = Scanner.next();
		address = Scanner.next();
		age = Scanner.netxInt();
		weight = Scanner.nextDouble();
		
		System.out.println("당신의 이름은 %s입니다.%n", name);
		System.out.println("당신의 주소는 %s입니다.%n", address);
		System.out.println("당신의 나이는 %d입니다.%n", age);
		System.out.println("당신의 체중은 %.1fkg입니다.%n", weight);

		
	}

}
