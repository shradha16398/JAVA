package Assignment4;
//SHAPE CLASS
public abstract class Shape {
    abstract void draw();
}


package Assignment4;
//CUBE CLASS
public class Cube extends  Shape{
    public void draw(){
        System.out.println("Cube is drawn");
    }
}

package Assignment4;
//LINE CLASS
public class Line extends Shape{
    public void draw(){
        System.out.println("Line is drawn");
    }
}

package Assignment4;
//RECTANGLE CLASS
public class Rectangle extends  Shape{
    public void draw(){
        System.out.println("Rectangle is drawn");
    }
}
package Assignment4;
//SQURE CLASS
public class Squre extends  Shape{
    public void draw(){
        System.out.println("squre is drawn");
    }
}


package Assignment4;
//MAIN CLASS
public class MainApp3 {
    public static void main(String[] args) {
        Shape l=new Line();
        Shape r=new Rectangle();
        Shape c=new Cube();
        Shape s=new Squre();
        drawAll(l);
        drawAll(r);
        drawAll(c);
        drawAll(s);
    }
    public static void drawAll(Shape s){
        s.draw();
    }
}


