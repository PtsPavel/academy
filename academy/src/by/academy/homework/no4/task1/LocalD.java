package by.academy.homework.no4.task1;

import by.academy.homework.no4.task1.datevalidator.ValidateDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalD {

	private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate date(String str) {
		if (new ValidateDate().validate(str)) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy").withLocale(Locale.US);
			date = LocalDate.parse(str, format);
			return date;
		} else {
			System.out.println("Ошибка ввода, пожалуйста, повторите попытку");
		}
		return null;
	}

	public void SumLocalDate(LocalDate date1, LocalDate date2) {
		System.out.println(
				"Количество дней в заданом промежутке состовляет " + Math.absExact(ChronoUnit.DAYS.between(date1, date2)) + " дней");
	}
}
