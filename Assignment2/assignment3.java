package Assignment3;
//BANK CLASS
public abstract class Bank {
    abstract public void disp();

}
package Assignment3;
//CURRENTACCOUNT CLASS
public class CurrentAccount extends Bank {
    double bal;
    double cc;
    public CurrentAccount(double bal,double cc){
        this.bal=bal;
        this.cc=cc;
    }
    public void disp(){
        System.out.println("Total money in current: "+(bal+cc));
    }
    public double get(){
        return bal+cc;
    }
}

package Assignment3;
//SAVINGACCOUNTCLASS
public class SavingAccount extends  Bank {
    double bal;
    double fixDep;
    public SavingAccount(double bal,double fixDep){
        this.bal=bal;
        this.fixDep=fixDep;
    }
    public void disp(){
        System.out.println("Total money in saving:"+(bal+fixDep));
    }
    public double get(){
        return bal+fixDep;
    }
}
package Assignment3;
//MAINCLASS
public class Mainapp2 {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount(30000,4000);
        CurrentAccount c=new CurrentAccount(500000,20000);
        s.disp();
        c.disp();
        double totalAmount=s.get()+c.get();
        System.out.println("The total money in bank: "+totalAmount);
    }
}


