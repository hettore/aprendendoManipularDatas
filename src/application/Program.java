package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//		
//		LocalDate d01 = LocalDate.now();
//		LocalDateTime d02 = LocalDateTime.now();
//		Instant d03 = Instant.now();
//		
//		LocalDate d04 = LocalDate.parse("2022-02-25");
//		LocalDateTime d05 = LocalDateTime.parse("2022-02-25T01:30:26");
//		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
//		//Instant d07 = Instant.parse("2022-07-20T01:30:26-3:00");
//		
//		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
//		LocalDate d09 = LocalDate.parse("20/07/2022 01:30", fmt2);
//		LocalDate d10 = LocalDate.of(2022, 7, 20);
//		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
//		
//		
//		
//		System.out.println("d01 = " + d01.toString());
//		System.out.println("d02 = " + d02.toString());
//		System.out.println("d03 = " + d03.toString());
//		System.out.println("d04 = " + d04.toString());
//		System.out.println("d05 = " + d05.toString());
//		System.out.println("d06 = " + d06.toString());
//		//System.out.println("d07 = " + d07.toString());
//		System.out.println("d08 = " + d08.toString());
//		System.out.println("d09 = " + d09.toString());
//		System.out.println("d10 = " + d10.toString());
//		System.out.println("d11 = " + d11.toString());
		
		
//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
//		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
//		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
//		
//		
//		LocalDate d04 = LocalDate.parse("2022-02-25");
//		LocalDateTime d05 = LocalDateTime.parse("2022-02-25T01:30:26");
//		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
//		
//		
//		System.out.println("d04 = " + d04.format(fmt1));
//		System.out.println("d04 = " + fmt1.format(d04));
//		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//		
//		System.out.println("d05 = " + d05.format(fmt1));
//		System.out.println("d05 = " + d05.format(fmt2));
//		
//		System.out.println("d06 = " + fmt3.format(d06));
//		System.out.println("d05 = " + d05.format(fmt4));
//		System.out.println("d06 = " + fmt5.format(d06));
//		System.out.println("d06 = " + d06.toString());
		
		
//		LocalDate d04 = LocalDate.parse("2022-02-25");
//		LocalDateTime d05 = LocalDateTime.parse("2022-02-25T01:30:26");
//		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
//		
//		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
//		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
//		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
//		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
//		
//		System.out.println("r1 = " + r1);
//		System.out.println("r2 = " + r2);
//		System.out.println("r3 = " + r3);
//		System.out.println("r4 = " + r4);
//		
//		System.out.println("d04 dia = " + d04.getDayOfMonth());
//		System.out.println("d04 mês = " + d04.getMonthValue());
//		System.out.println("d04 ano = " + d04.getYear());
//		
//		System.out.println("d05 hora = " + d05.getHour());
//		System.out.println("d05 hora = " + d05.getMinute());
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastweekInstant = " + pastWeekInstant);
		System.out.println("nextweekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
		
	}

}
