package homework;

public class Java134p_5_4 {
public static void main(String[] args) {
	for(int i = 0; i < 7; i++) {
		for(int j = 0; j < 7 - i; j++) {
			System.out.print(" ");
		}
		for(int k = 0; k < (2*i) + 1; k++) {
			System.out.print
			("*");
		}
		System.out.println();
	}
}
}
