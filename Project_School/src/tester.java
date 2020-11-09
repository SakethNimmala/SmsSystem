import java.util.Scanner;

public class tester {
	public static void main(String[] args) {
		stuMenu sm = new stuMenu();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("`````````````````````````````");
			System.out.println(" Welcome to the App");
			System.out.println("  Press 1 for Student Menu");
			System.out.println("  Press 2 for Exit out of App");
			System.out.println("`````````````````````````````");
			System.out.println("Enter the choice : ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				sm.Menu();
				break;
			case 2:
				System.out.println("Thanks for using the App");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			sc.close();
		}
		
	}

}
