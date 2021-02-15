package by.academy.classwork.lesson10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {

	public static void main(String[] args) {
		LocalDate firstJanuary1970 = LocalDate.of(1970, 1, 1);
		firstJanuary1970 = firstJanuary1970.plusYears(30);
		firstJanuary1970 = firstJanuary1970.minusMonths(7);
		firstJanuary1970 = firstJanuary1970.minusDays(3);

		System.out.println(firstJanuary1970);
	}

}
