package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program2 {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Ligiane", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1001, "Ligiane", 1000.0,0.01);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc3 = new BusinessAccount(1003,"Ligiane", 1000.0, 500.0);
        acc1.withdraw(200);
        System.out.println(acc3.getBalance());


    }

}
