import java.util.Scanner;

public class stuDetails {
	Scanner sc = new Scanner(System.in);	
	student[] star;
	public void addstudents() {
		System.out.println("Enter the no of records: ");
	    int num= sc.nextInt();
		star = new student[num];
		for(int i=0; i<num;i++) {
		System.out.println("Enter the sno: ");
		int sno = sc.nextInt();
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the adr: ");
		String adr = sc.next();
		star[i]= new student(sno,name,adr);
		}

		
	}
	public void display() {
		for(student st: star) {
			if(st!=null)
			System.out.println(st.getSno()+" "+st.getName()+" "+st.getAdr());
		}
	}
	public student specificRec(int sno) {
		for(student sb: star) {
			if(sb.getSno()==sno) {
				return sb;
			}
		}
		return null;
	}
	public void update(int sno) {
		System.out.println("Update \n Name - Type N \n Address- Type A \n");
		String ch = sc.next();
		int k=0,j=0;
		switch(ch) {
		case "N":
			for(student s : star) {
				if(s.getSno()==sno) {
					System.out.println("Type the Name:");
					String name = sc.next();
					s.setName(name);
					System.out.println("Name for Record: "+s.getSno()+" is updated");
					k++;
				}
			}
			if(k==0) {
				System.out.println("No record found");
			}
			break;
		case "A":
			for(student s : star) {
				if(s.getSno()==sno) {
					System.out.println("Type the Address:");
					String adr = sc.next();
					s.setAdr(adr);
					System.out.println("Address for Record: "+s.getSno()+" is updated");
					j++;
				}
			}
			if(j==0) {
				System.out.println("No record found");
			}
			break;
		default:
			System.out.println("Enter valid input");
			break;
		}
	}
	public void deleteRec(int sno) {
		int d=0;
		int n=-1;
		for(student sb: star) {
			n++;
			if(sb.getSno()==sno) {
				star[n]=null;
				d++;
				System.out.println("Record deleted Successfully");
			}
		}
		if(d==0) {
			System.out.println("No Record Found");
		}
	}

}
