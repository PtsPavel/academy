package by.academy.deal;

public class ApplicationDemo {
    public static void main(String[] args) {
        Product cheese = new Cheese(20, "Пармезан", "Итальянская сыроварня", 20, 40);
        Product wine = new Wine(30, "Шанет", "Минский ликероводоынй", 10, "red", 6);

        Person seller = new Person("Seller", "375440000000", "sellermail@gmail.com", 500.00);
        Person buyer = new Person("Buyer", "375440000000", "buyermail@gmail.com", 500.00);

        Deal deal = new Deal(seller, buyer, "02-07-2021");

        deal.addProduct(cheese);
        deal.addProduct(wine);


        deal.deal();

    }
}
