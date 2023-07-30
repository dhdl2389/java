package day9.class자료형;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

public class Localdate {

	   public static void main(String[] args) {
	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

	      LocalDate date1 = LocalDate.parse("20220211", formatter);
	      LocalDate date2 = LocalDate.now();

	      long days = DAYS.between(date1, date2);

	      System.out.println(days + " days");
	   }
}