import java.util.Scanner;

public class stuMenu {
	Scanner sc = new Scanner(System.in);
	public void Menu() {
		stuDetails sd = new stuDetails();
		while(true) {
			System.out.println("`````````````````````````````````");
			System.out.println(" 1 for Adding Students");
			System.out.println(" 2 for Displaying all Students");
			System.out.println(" 3 for Display a particular Student");
			System.out.println(" 4 for Update a Student");
			System.out.println(" 5 for Delete a Student");
			System.out.println(" 6 for going Back");
			System.out.println("`````````````````````````````````");
			System.out.println("Select an Option: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				sd.addstudents();
				System.out.println("Students added succesfully");
				break;
			case 2:
				sd.display();
				break;
			case 3:
				System.out.println("Enter a specific record : ");
				int rec = sc.nextInt();
				student st = sd.specificRec(rec);
				System.out.println(st.getSno()+" "+st.getName()+" "+st.getAdr());
				break;
			case 4:
				System.out.println("Enter a specific record :");
				int re = sc.nextInt();
				sd.update(re);
				break;
			case 5:
				System.out.println("Enter a specific record :");
				int de = sc.nextInt();
				sd.deleteRec(de);
				break;
			case 6:
				System.out.println("Going back");
				tester.main(null);
				break;
			default:
				System.out.println("Invalid choice");
				//break;
			}
		}
	}

}
