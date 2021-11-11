
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface info{
    int authorID();
    String author() default "Null";
    String supervisor() default "Null";
    String date();
    String time();
    int version();
    String description() default "General class";
}
@info(authorID = 12, date = "21 March", time = "4pm", version = 6)
class custom {
    String s;

    public custom(String s) {
        this.s = s;
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        custom c=new custom("this is annotation class");
        Class c1=c.getClass();
        Annotation an=c1.getAnnotation(info.class);
        info i=(info)an;
        System.out.println(i.author());
        System.out.println(i.authorID());
        System.out.println(i.date());
        System.out.println(i.time());
        System.out.println(i.version());
        System.out.println(i.description());
        System.out.println(i.supervisor());

    }

}