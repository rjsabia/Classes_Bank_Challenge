package com.company;

public class Main {

    public static void main(String[] args) {


        Accounts russell = new Accounts();

        russell.setName("Russ");
        russell.setEmail("rjs@gmail.com");
        russell.setAccountNumber("12345678910");
        russell.setBalance(25);
        russell.setPhoneNumber("(333) 333-3333");

        System.out.println("Hello " + russell.getName()
                + ", Your current balance is: " + russell.getBalance());

        System.out.println("*********************************");

        Accounts danielle = new Accounts();
        Accounts Elleigh = new Accounts();

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

    }

}
