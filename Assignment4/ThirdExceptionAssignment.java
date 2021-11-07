package ASSGINMENTNO3;

public class Account {
    double balance=3000;
    public double getBalance()
    {
        return balance;
    }
    public void withdraw(double amount) throws RaiseInsufficientBalanceException,RaiseIllegalBankTransactionException

    {
        if(amount==0 || amount >balance)
        {
            throw  new RaiseInsufficientBalanceException("enter the valid amount");
        }
        if(amount<0)
        {
            throw new RaiseIllegalBankTransactionException("you enter negative amount please enter positive and valid amount");
        }
        balance=balance-amount;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("your total balance is " +balance);
    }
    public static void main(String[] args) {
        Account a=new Account();
        a.deposit(200);
        try {
            a.withdraw(-1000);
        }catch (RaiseInsufficientBalanceException re)
        {
            System.out.println(re);
        }catch (RaiseIllegalBankTransactionException rl)
        {
            System.out.println(rl);
        }

    }

}
