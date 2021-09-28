package com.makhabatusen;

public class Main {

    public static void main(String[] args) {

        // #1 BankAccountPublic class with public fields
        BankAccountPublic bankAccountPublic = new BankAccountPublic();
        bankAccountPublic.ID = 1;
        bankAccountPublic.balance = 15;
        System.out.printf("\n%s's ID: %d and balance: %d", bankAccountPublic.getClass().getSimpleName(),
                bankAccountPublic.ID, bankAccountPublic.balance);


        System.out.println("\n_______");


        // #2 BankAccountPrivate class with private fields and public methods
        BankAccountPrivate bankAccountPrivate = new BankAccountPrivate(2, 15000);
        System.out.printf("\n%s's ID: %d and initial balance: %d", bankAccountPrivate.getClass().getSimpleName(),
                bankAccountPrivate.getID(), bankAccountPrivate.getBalance());

        bankAccountPrivate.deposit(5000);
        System.out.printf("\n%s's ID: %d and balance after deposit: %d", bankAccountPrivate.getClass().getSimpleName(),
                bankAccountPrivate.getID(), bankAccountPrivate.getBalance());

        bankAccountPrivate.withdraw(2000);
        System.out.printf("\n%s's ID: %d and balance after withdraw: %d", bankAccountPrivate.getClass().getSimpleName(),
                bankAccountPrivate.getID(), bankAccountPrivate.getBalance());


        System.out.println("\nTrying to get 19 000:");
        bankAccountPrivate.withdraw(19000);

        System.out.println("\n_______");

        // #3 Home class with method returning years past from construction year and
        // method showing all the info
        Home home = new Home("Ihlas Residence", 2019, 15);
        home.getHomeInfo();

        System.out.println("\n_______");

        // #4 Cat class with 5 initiators

        Cat cat1 = new Cat("Masya");
        cat1.getCatInfo();

        Cat cat2 = new Cat("Marsik",  4, 5);
        cat2.getCatInfo();

        Cat cat3 = new Cat("Marsik",  5);
        cat3.getCatInfo();

        Cat cat4 = new Cat(5, "black");
        cat4.getCatInfo();

        Cat cat5 = new Cat(3,"brown", "Lomonosov str.5");
        cat5.getCatInfo();

    }
}