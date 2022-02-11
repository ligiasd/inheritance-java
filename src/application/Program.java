package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1011, "Ligiane", 0.0);
        BusinessAccount bacc = new BusinessAccount(1022, "Guilherme",0.0, 500.00);

        //    upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1022, "Lucas",0.0, 500.00);
        Account acc3 = new SavingsAccount(1033, "Ligiane", 0.0,0.01);

        //        downcasting

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

//        BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 =  (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 =  (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }







    }


}
