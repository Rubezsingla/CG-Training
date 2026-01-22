package ObjectOrientedDesignProblem.ObjectDesign;

import java.util.ArrayList;

// Account class
class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

// Customer class
class Customer {
    private String name;
    private Account account;

    public Customer(String name) {
        this.name = name;
    }

    // Link account to customer
    public void setAccount(Account account) {
        this.account = account;
    }

    // View balance
    public void viewBalance() {
        if (account != null) {
            System.out.println(name + "'s Account Balance: ₹" + account.getBalance());
        } else {
            System.out.println(name + " does not have an account.");
        }
    }

    public String getName() {
        return name;
    }
}

// Bank class
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Open account for customer
    public void openAccount(Customer customer, int accNo, double balance) {
        Account account = new Account(accNo, balance);
        customer.setAccount(account);
        customers.add(customer);

        System.out.println("Account opened for " + customer.getName() +
                " in " + bankName);
    }

    // Display all customers
    public void showCustomers() {
        System.out.println("\nCustomers in " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}

// Main class
public class BankAccountHolder {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");

        Customer c1 = new Customer("Rohit");
        Customer c2 = new Customer("vanshika");

        bank.openAccount(c1, 101, 50000);
        bank.openAccount(c2, 102, 75000);

        bank.showCustomers();

        c1.viewBalance();
        c2.viewBalance();
    }
}

