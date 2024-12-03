package homework;

import java.util.Scanner;

public class Java140p_5_8 {
public static void main(String[] args) {
	int magicNumber = (int)(Math.random() * 50) + 1;
	Scanner sc = new Scanner(System.in);
	boolean isMatched = false;
	
	for(int i = 0; i < 10; i++) {
		
		System.out.println("찾는 숫자를 입력 >> ");
		int guess = sc.nextInt();
		
		if(guess == magicNumber) {
			System.out.println((i+1) + "번쨰에 맞췄습니다!");
			isMatched =true;
			break;
			
		}else if(guess > magicNumber) {
			System.out.println("맞춰야할 숫자가 더 작습니다.");
		}else if(guess < magicNumber) {
			System.out.println("맞춰야할 숫자가 더 큽니다.");
		}
	}
	if(!isMatched) {
		System.out.println("정답을 맞추지 못했습니다.");
		
		
	
	}
}
}
