import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class challenge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isGood = true;
		int userIn;
		char cont = 'y';
		while (cont == 'y' || cont == 'Y') {

			while (isGood == true) {
				System.out.print("Please enter an integer between 1-100: ");
				userIn = scan.nextInt();
				scan.nextLine();
				if (userIn > 100 || userIn < 1) {
					System.out.println("That integer is not between 1-100.");
					isGood = true;
				} else {
					System.out.println("Integer is between 1-100");
					isGood = false;
				}
				if (userIn % 15 == 0) {
					System.out.println("Integer is divivisible by 15.");
					System.out.println("Integer is divisible by 5.");
					System.out.println("Integer is divisible by 3.");
				} else if (userIn % 5 == 0) {
					System.out.println("Integer is divisible by 5.");
				} else if (userIn % 3 == 0) {
					System.out.println("Integer is divisible by 3.");
				} else {
					System.out.println("Integer is not divisible by 3, 5, or 15.");
				}


			}
			System.out.print("Continue? (y/n): ");
			cont = scan.nextLine().charAt(0);
			isGood = true;
		}
		System.out.println("Goodbye!");

	}
}
