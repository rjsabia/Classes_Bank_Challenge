package com.company;

public class Main {

    public static void main(String[] args) {


        Accounts russell = new Accounts();
        Accounts danielle = new Accounts();
        Accounts Elleigh = new Accounts();

        // Test negative withdrawal
        russell.withdrawal(100.00);

        // Test deposit and negative withdrawal
        russell.deposit(50.00);
        russell.withdrawal(100);

        // Test add more money, then successful withdrawal
        russell.deposit(100.00);
        russell.withdrawal(50.00);


        //Test class
//        Elleigh.setName("Elleigh");
//        Elleigh.setAccountNumber("123456789");
//        Elleigh.setBalance(1000000);
//        Elleigh.setEmail("eas@gmail.com");
//
//        System.out.println("Hello " + Elleigh.getName() + ". The current balance for account: "
//                + Elleigh.getAccountNumber() + " is: " + Elleigh.getBalance());
//        System.out.println("********************************");
//        System.out.println("Hello " + russell.getName() + ". The current balance for account: "
//                + russell.getAccountNumber() + " is: " + russell.getBalance());

    }

}
