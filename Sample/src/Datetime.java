import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Datetime {

	public static void main(String[] args) {
		DateTimeFormatter DTF=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.format(DTF));
		
		ZonedDateTime zd=ZonedDateTime.now(ZoneId.of("GMT+6"));
		System.out.println(zd);
		
		LocalDateTime IND=LocalDateTime.of(1947, Month.AUGUST, 15, 0, 0);
		
		Duration d=Duration.between(IND, today);
		System.out.println(d.toDays());
		
		
		
	}

}
