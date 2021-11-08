package ASSGINMENTNO3;

import java.util.Scanner;

public class Account {
    double balance = 3000;
    int id = 1234;

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws RaiseInsufficientBalanceException, RaiseIllegalBankTransactionException {
        if (amount == 0 || amount > balance) {
            throw new RaiseInsufficientBalanceException("enter the valid amount");
        }
        if (amount < 0) {
            throw new RaiseIllegalBankTransactionException("you enter negative amount please enter positive and valid amount");
        }
        balance = balance - amount;
    }

    public void deposit(double amount) throws RaiseIllegalBankTransactionException {


        if (amount <= 0) {
            throw new RaiseIllegalBankTransactionException("you deposting wrong amount plzz deposite correct amount");

        } else {
            balance = balance + amount;
            System.out.println("your total balance is " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Account a1=new Account();
          System.out.println("enter your choice");
          System.out.println("1.withdraw 2.deposit 3.exist");
          int choice=sc1.nextInt();
          if(choice==1)
          {
              System.out.println("enter amount you want to withdraw");
              int w= sc1.nextInt();
              a1.withdraw(w);

          }
          else if(choice==2)
          {
              System.out.println("enter amount you want to deposite");
              int d= sc1.nextInt();
              a1.deposit(d);

          }
          else {
              System.exit(0);
          }

    }
}