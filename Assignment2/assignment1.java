
1.write a singletone class.conform that singletone class can not be inherited

 
package SingletoneDemo;
/*we can not extend singletone class beacause
1.it wont have default constructor and we make user define constructor as private
 */

public class Facebook {
    static Facebook f1;
    private  Facebook()
    {
        System.out.println("session started");

    }
    static Facebook getsession()
    {
        if(f1==null)
        {
            f1= new Facebook(); //singletone object
        }
        return  f1;
    }
    void displayprofile()
    {
        System.out.println("show user profile");
    }
    void displayhome()
    {
        System.out.println("Facebook home page");
    }
}


//MAIN CLASS

public class MainApp3 {
    public static void main(String[] args) {
      Facebook f2=Facebook.getsession();
      f2.displayhome();
      Facebook f3=Facebook.getsession();
      f3.displayprofile();

    }
}
