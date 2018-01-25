import java.util.Scanner;

public class whileLoopExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Do some stuff!");
			
			//this is where your code should end
			System.out.println("Do you want to continue? y/n");
			cont = scan.nextLine();
		}
		
		// let the user know the program has ended
		System.out.println("Goodbye!");
		
		scan.close();
	}
}
