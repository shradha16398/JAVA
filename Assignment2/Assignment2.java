package Assignment2;
//EMPLOYEECLASS
public abstract class Employee {
    abstract public void salary();

}

//MANAGERCLASS

package Assignment2;

public class Manegar  extends  Employee{
    int sal,incentive;
    public Manegar(int sal,int incentive){
        this.sal=sal;
        this.incentive=incentive;
    }
    public void salary(){
        System.out.println("Manager Salary:"+(sal+incentive));
    }
    public int get(){
        return sal+incentive;
    }
    }


//LABOUR CLASS

package Assignment2;

public class Labour extends  Employee{
    int overtime;
    int labour_salary;

    public Labour(int labour_salary,int overtime){
        this.labour_salary=labour_salary;
        this.overtime=overtime;
    }
    public void salary(){
        System.out.println("Labour Salary:"+(labour_salary+overtime));
    }
    public int get(){
        return labour_salary+overtime;
    }
}


//MAINCLASS

package Assignment2;

public class Mainapp1 {
    public static void main(String[] args) {
        Manegar m=new Manegar(5000,1000);
        Labour l=new Labour(150,40);
        m.salary();
        l.salary();
        int totalSalary=m.get()+l.get();
        System.out.println("Total Salary of all employees: "+totalSalary);
    }
}

