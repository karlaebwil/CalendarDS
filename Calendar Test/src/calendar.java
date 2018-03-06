
public class calendar {

	int Day;
	int Month;
	int Year;
	String Event;
	
	public calendar(int day, int month, int year, String event) {
		super();
		Day = day;
		Month = month;
		Year = year;
		Event = event;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}
	
	public void showDay() {
		System.out.print("The date is " + Day + " " + Month + 
				" " + Year +". ");
		System.out.println("The event today is " + Event);
	}
}
