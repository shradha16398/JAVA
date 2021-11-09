package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class    Assignment2 {
    public static void main(String[] args) {


       product p1=new product("Laptop");
       product p2=new product("computer");
       product p3=new product("Desktop");
        product p4=new product("USB");
        product p5=new product("BLUETOOTH");
        product p6=new product("HEADPHONES");
        product p7=new product("Mouse");
        product p8=new product("Keyboard");
        product p9=new product("ROUTER");
        product p10=new product("Cable");
        Set<product> t1=new HashSet<product>();
        t1.add(p1);
        t1.add(p2);
        t1.add(p3);
        t1.add(p4);
        t1.add(p5);
        t1.add(p6);
        t1.add(p7);
        t1.add(p8);
        t1.add(p9);
        t1.add(p10);
        //adding duplicate values
       // t1.add(p10);
        System.out.println("Adding duplicate values");

    }

}
class product{
    private String productName;

    public product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "product{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
