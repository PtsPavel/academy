package by.academy.homework.no4.task1;

import by.academy.homework.no4.task1.datevalidator.ValidateDate;

import java.util.Scanner;

public class Builder {
    private Date date;
    private Menu menu;
    private Menu menu2;
    private LocalD after;
    private LocalD before;
    private LocalD period;
    private final Scanner sc = new Scanner(System.in);

    public LocalD getAfter() {
        return after;
    }

    public LocalD getBefore() {
        return before;
    }

    public Date getDate() {
        return date;
    }

    public Menu getMenu2() {
        return menu2;
    }

    public Menu getMenu() {
        return menu;
    }

    // Основной метод

    public void inputBuilder() {
        menu = new Menu();
        System.out.println(menu.getMenuMain());
        String str = input("Сделайте свой выбор");
        while (!str.equals("4")) {
            switch (str) {
                case "1":
                    inputDate();
                    System.out.println(date.toString());
                    System.out.println("Press any key to continue...");
                    sc.nextLine();
                    break;

                case "2":
                    inputLocaleDate();
                    break;
                case "3":
                    if (date == null) {
                        System.out.println("Для начала выберите пунк 1!");
                        break;
                    }
                    System.out.println("Год высокосный? " + date.getYear().leapYear());
                    System.out.println("Press any key to continue...");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Вы сделали неправильный выбор!");
                    break;
            }
            System.out.println();
            System.out.println(menu.getMenuMain());
            str = input("Сделайте свой выбор");
        }
        sc.close();
    }


    // Расчет количества дней

    public void inputLocaleDate() {
        menu2 = new Menu();
        System.out.println(menu2.getMenuSumDate());
        String str = input("Сделайте свой выбор");
        while (!str.equals("4")) {
            switch (str) {
                case "1":
                    after = LocalD();
                    System.out.println("Press any key to continue...");
                    sc.nextLine();
                    break;
                case "2":
                    before = LocalD();
                    System.out.println("Press any key to continue...");
                    sc.nextLine();
                    break;
                case "3":
                    sum();
                    System.out.println("Press any key to continue...");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Вы сделали не правильный выбор!");
                    break;
            }

            System.out.println();
            System.out.println(menu2.getMenuSumDate());
            str = input("Сделайте свой выбор");
        }

    }

    public void sum() {
        period = new LocalD();
        period.SumLocalDate(getAfter().getDate(), getBefore().getDate());
    }

    public LocalD LocalD() {
        String str = input("Введите дату в формате dd-MM-yyyy ");
        LocalD da = new LocalD();
        da.date(str);
        return da;
    }

    // Создание и валидация даты

    public void inputDate() {

        String str = input("Введите дату в формате dd-MM-yyyy");
        if (new ValidateDate().validate(str)) {
            date = new Date();
            String[] array = str.split("-");
            Date.Day d = date.new Day(Integer.parseInt(array[0]));
            Date.Month m = date.new Month(Integer.parseInt(array[1]));
            Date.Year y = date.new Year(Integer.parseInt(array[2]));
            date.create(y, m, d);
            System.out.println("Валидация прошла успешно.");
            System.out.println("Дата успешно создана.");

        } else {
            System.out.println("Что-то пошло не так.");
        }
    }

    public String input(String message) {
        System.out.print(message + " - ");
        String str = sc.nextLine().trim();
        return str;
    }
}
