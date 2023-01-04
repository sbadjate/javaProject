import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;
public class Test {
	public static void main(String args[]) {
		TimeZone timeZone = TimeZone.getTimeZone("UTC");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        dateFormat.setTimeZone(timeZone);
        //String date = dateFormat.format(new Date());
        String date = Instant.now().toString();
        String response = "{ \"currentTime\": \""+date+"\", "+"\"status\": \"OK\" }";
		System.out.println(response);
	}
}
