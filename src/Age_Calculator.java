import java.util.Scanner;

public class Age_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		
		String[] parts = new String[10];

		System.out.println("---Welcome to Age Calculator---");
		System.out.println("Git Check");
		System.out.println("There are two choices in this projrct:");
		System.out.print("1. From one date to another & ");
		System.out.println("2. Your age till now.");
		System.out.print("Enter your choice: ");
		
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.print("From: ");
			String dateFrom = scc.nextLine();
			parts = dateFrom.split("/");
			int dayFrom = Integer.parseInt(parts[0]);
			int monthFrom = Integer.parseInt(parts[1]);
			int yearFrom = Integer.parseInt(parts[2]);
			
			System.out.print("To: ");
			String dateTo = scc.nextLine();
			parts = dateTo.split("/");
			int dayTo = Integer.parseInt(parts[0]);
			int monthTo = Integer.parseInt(parts[1]);
			int yearTo = Integer.parseInt(parts[2]);
			
			Calculator cal = new Calculator(dayFrom, monthFrom, yearFrom, dayTo, monthTo, yearTo);
			cal.ShowResult();
			break;
		case 2:
			System.out.println("case: 2");
			break;
		default:
			System.out.println("Stop");
		}
		
		/*int day = dayTo - dayFrom;
		int month = monthTo - monthFrom;
		int year = yearTo - yearFrom;
		
		if(day < 0) {
			day+=30;
			month-=1;
		}
		if(month < 0) {
			month+=12;
			year-=1;
		}
		
		System.out.println("Your age is: " + year + " year(s) " + month +
				" month(s) " + day + " day(s).");
		*/
	}

}
