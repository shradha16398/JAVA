
1.write a singletone class.conform that singletone class can not be inherited

 
class Singleton {
    
    private static Singleton single_instance = null;
    public String s;
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
 
    
    public static Singleton Singleton()
    {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
 

public class Gfg {
	   
    public static void main(String args[])
    {
        Singletone x = Singletone.Singleton();
 
        Singletone y = Singletone.Singleton();
 
        Singletone z = Singletone.Singleton();
 
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
        z.s = (z.s).toLowerCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}