import java.util.Calendar;

/*
 * Goal: Print hello on screen according when it is now.
 *
 * Use "if else" to determine what to print.
 *
 * 1. use the the function 'getInstance' to get the time and date now;
 * 2. use 'if else' to print some different sentences.
 */
public class Clock {
	public static void main(String[] args) {
		// get current time and date
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);

		// display greeting
		if (hour < 12) {
			System.out.println("Good morning.\n");
		} else if (hour < 17) {
			System.out.println("Good afternoon.\n");
		} else {
			System.out.println("Good evening.\n");
		}

		// beging time message by showing the minutes
		System.out.print("It's");
		if (minute != 0) {
			System.out.print(" " + minute + " ");
			System.out.print( (minute != 1) ? "minutes":
				"minute");
			System.out.print(" past");
		}

		// display the hour
		System.out.print(" ");
		System.out.print( (hour > 12) ? (hour - 12) : hour );
		System.out.print(" o'clock on ");

		// display the name of the month
		switch (month) {
		case 0:
			System.out.print("January");
			break;
		case 1:
			System.out.print("February");
			break;
		case 2:
			System.out.print("March");
			break;
		case 3:
			System.out.print("April");
            break;
		case 4:
			System.out.print("May");
			break;
		case 5:
			System.out.print("June");
            break;
		case 6:
			System.out.print("July");
			break;
		case 7:
			System.out.print("August");
			break;
		case 8:
			System.out.print("September");
			break;
		case 9:
			System.out.print("October");
			break;
		case 10:
			System.out.print("November");
			break;
		case 11:
			System.out.print("December");
			break;
		}
	}
}
