package by.academy.homework.no7.Task2;

public class Main {
    public static void main(String[] args) {

        User PavelUser = new User("Pavel", "qwe123", "email@mail.com");
        PavelUser.setFirstName("Pavel");
        PavelUser.setLastName("Petsukha");
        PavelUser.setAge(36);
        PavelUser.setDateOfBirth("04111984");

        System.out.println(PavelUser.printUserInfo());
    }
}