
public class TestBench {

	private static calendar cal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cal = new calendar(1, 1, 2018, "Test Date");
		
		System.out.println("This should print");
		cal.showDay();
		
		cal.setDay(2); cal.setMonth(1);	cal.setYear(2018);
		cal.setEvent("Cousin's birthday");
		
		System.out.println("\nThere has been a change.");
		cal.showDay();
	}

	//This should reflect a new change
	//indicating that the new commit and push was successful

}
