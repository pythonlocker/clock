import java.util.Calendar;
import java.lang.StringBuilder;
import java.util.HashMap;

public class Clock2 {
    private static HashMap<Integer, String> MAP = new HashMap<Integer, String>();
    static {
        MAP.put(0, "Jan");
        MAP.put(1, "Feb");
        MAP.put(2, "Mar");
        MAP.put(3, "Apr");
        MAP.put(4, "May");
        MAP.put(5, "Jun");
        MAP.put(6, "Jul");
        MAP.put(7, "Aug");
        MAP.put(8, "Sep");
        MAP.put(9, "Oct");
        MAP.put(10, "Nov");
        MAP.put(11, "Dec");
    }

	public static void main(String[] args) {
		// get current time and date
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);

        // This is called string formating
        // You create a template with normal words and symbols like %s, %d
        // These symbols will be replaced with actual value when you call
        // String.format.
        //
        // %s is replaced with another string value
        // %d is replaced with integer value
        //
        // for example:
        // int a = 10
        // String b = 20
        // String.format("%s + %d", b, a); //This returns "20 + 10"
        String template = "Good %s!\nIt's %d minute%s past %d on %s";

        String phase = getPhase(hour); //It's good to split code into smaller methods
        String multiple = minute == 1 ? "" : "s";
        int hourIn12 = hour > 12 ? hour - 12 : hour;
        // This is called a map, it's like a dictionary,
        // you can store key with value in the map, and later on retrieve the value
        // from the key
        String monthString = MAP.get(month);
        String finalMessage = String.format(
                template, phase, minute, multiple, hourIn12, monthString);

        System.out.println(finalMessage);
	}

    static String getPhase(int hour) {
        if (hour < 12) {
            return "morning";
        } else if (hour < 17) {
            return "afternoon";
        } else {
            return "evening";
        }
    }
}
