import java.util.Calendar;

public class Clock1 {
	public static void main(String[] args) {
		// get current time and date
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);

		// display greeting
        String greeting;
		if (hour < 12) {
			greeting = "Good morning.";
		} else if (hour < 17) {
			greeting = "Good afternoon.";
		} else {
			greeting = "Good evening.";
		}

		// beging time message by showing the minutes
        String timeMessage = "It's";
		if (minute != 0) {
			timeMessage += " " + minute + " ";
            timeMessage += (minute != 1) ? "minutes" : "minute";
            timeMessage += " past ";
		}

		// display the hour
        timeMessage += (hour > 12) ?
            Integer.toString(hour - 12) : Integer.toString(hour);
		timeMessage += " o'clock on ";

		// display the name of the month
		switch (month) {
		case 0:
			timeMessage += "January";
			break;
		case 1:
			timeMessage += "February";
			break;
		case 2:
			timeMessage += "March";
			break;
		case 3:
			timeMessage += "April";
            break;
		case 4:
			timeMessage += "May";
			break;
		case 5:
			timeMessage += "June";
            break;
		case 6:
			timeMessage += "July";
			break;
		case 7:
			timeMessage += "August";
			break;
		case 8:
			timeMessage += "September";
			break;
		case 9:
			timeMessage += "October";
			break;
		case 10:
			timeMessage += "November";
			break;
		case 11:
			timeMessage += "December";
			break;
		}

        //only print message once
        System.out.println(greeting+"\n"+timeMessage);
	}
}
