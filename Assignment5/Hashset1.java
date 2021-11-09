package Generic;

import java.util.HashSet;

 class Employee {
    private  int id,salary;
    private  String name,department_Name;

    public Employee(int id, int salary, String name, String department_Name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department_Name = department_Name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }
    public void display_details()
    {
        System.out.print("ID:" +id +"\t" +"NAME:" +name +"\t"+"DEPARTMENT_NAME:" +department_Name +"\t"+"SALARY:" +salary +"\t");

    }
}


public class Hashset1
{
    public static void main(String[] args)
    {
        HashSet<Employee> set = new HashSet<>();
        Employee e1 = new Employee(45679,20000,"Shradha","development");
        Employee e2= new Employee(345678,40000,"Shweta","teacher");
        Employee e3 = new Employee(67789,30000,"Shreyash","anaylst");
        set.add(e1);
        set.add(e2);
        set.add(e3);

        for(Employee e:set){
            e.display_details();
        }
    }
}
