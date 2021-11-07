write a appliction to join the two strings "HELLO," &"HOW ARE YOU?"(USE STRING FUNCTION)
public class StringDemo1 {
    public static void main(String[] args) {
        String str="HELLO,";
        String str2="How are you?";
        String str3=str.concat(str2);
        System.out.println("two joined strings are:" +str3);
    }
}
