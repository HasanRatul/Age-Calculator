
public class Calculator {
	int dayFrom, monthFrom, yearFrom, dayTo, monthTo, yearTo, day, month, year;
	
	Calculator(int dayFrom, int monthFrom, int yearFrom, int dayTo, int monthTo, int yearTo){
		this.dayFrom = dayFrom;
		this.monthFrom = monthFrom;
		this.yearFrom = yearFrom;
		this.dayTo = dayTo;
		this.monthTo = monthTo;
		this.yearTo = yearTo;
	}
	
	void Calculation() {
		day = dayTo - dayFrom;
		month = monthTo - monthFrom;
		year = yearTo - yearFrom;
		if(day < 0) {
			day+=30;
			month-=1;
		}
		if(month < 0) {
			month+=12;
			year-=1;
		}
	}
	
	void ShowResult() {
		Calculation();
		System.out.println("Your age is: " + year + " year(s) " + month +
				" month(s) " + day + " day(s).");
	}
}
