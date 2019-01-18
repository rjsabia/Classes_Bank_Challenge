package com.company;

public class Main {

    public static void main(String[] args) {

        // Passing arguments to the constructor
        Accounts russell = new Accounts("Russell", "1234567891",
                "rjs@gmail.com", "33333333333", 25);

        // Will call to the empty constructor
        Accounts Elleigh = new Accounts();

//        ****************************************
//        This is how you would set up a class without a constructor

//        Accounts russell = new Accounts();
//
//        russell.setName("Russ");
//        russell.setEmail("rjs@gmail.com");
//        russell.setAccountNumber("12345678910");
//        russell.setBalance(25);
//        russell.setPhoneNumber("(333) 333-3333");
//        Accounts danielle = new Accounts();
//        Accounts Elleigh = new Accounts();
//        ****************************************

        // Test EMPTY constructor setup
        System.out.println("Hello " + Elleigh.getName()
                + ", Your current balance is: " + Elleigh.getBalance());
        System.out.println("*********************************");

        // Test constructor setup
        System.out.println("Hello " + russell.getName()
                + ", Your current balance is: " + russell.getBalance());
        System.out.println("*********************************");
        //********************************
        // Test application functionality
        //********************************

        // Test negative withdrawal
        russell.withdrawal(100.00);
        // Test deposit and negative withdrawal
        russell.deposit(50.00);
        russell.withdrawal(100);
        // Test add more money, then successful withdrawal
        russell.deposit(100.00);
        russell.withdrawal(50.00);
        //********************************

    }

}
