
public class TwelveDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		firstDay();
		init();
		secondDay();
		
	}
	public static void init() {
		System.out.println("One the first day of Christmas,\nmy true love sent to me");
	}
	public static void firstDay() {
		System.out.println("a partridge in a pear tree.\n");
	}
	public static void secondDay() {
		System.out.println("two turtle doves, and");
		firstDay();
	}

}
