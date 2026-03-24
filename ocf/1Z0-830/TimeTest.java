import java.time.*;

public class TimeTest{
	public static void main(String[] args){
		LocalDate ld = LocalDate.now().withMonth(6).withDayOfMonth(2);
		LocalTime lt =LocalTime.of(6,0,0);
		LocalDateTime ldt = ld.atTime(lt);
		ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5,0);
		ZoneId nyZone = ZoneId.of("America/New_York");
		OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
		ZonedDateTime nyZdt = ldt.atZone(nyZone);
		Duration d = Duration.between(nyOdt,nyZdt);
		System.out.println(d);
	}
}
