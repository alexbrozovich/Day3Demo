import java.util.Scanner;

public class ifelsepractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		
		if (age >= 18) {
			System.out.println("Congratuations, you can legally vote!");
		}
		else if (age >= 16 && age < 18) {
			System.out.println("Go take some voter education classes!");
		}
		else {
			System.out.println("Do some research!");
		}
		
		scan.close();
	}

}
