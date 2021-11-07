package StringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {
        //WRITE AN APPLICATION TO APPEND THE FOLLOWING STRING "StringBuilder ","is a peer class of String","the functionality of string"
        StringBuilder sb=new StringBuilder("StringBuilder ");
        sb.append("is a peer class of String");
        sb.append("the functionality of string");
        System.out.println("The appended string is :" +sb);

        //INSERT THE FOLLOWING STRING "INSERT TEXT" INTO THE STRING "IT IS USED TO _" AT THE SPECIFIED INDEX POSITION" AT THE LOCTION DENOTED SIGN  _
        StringBuilder sb2=new StringBuilder("it is used to_  at the specified index position ");
        sb2.insert(13," insert text");


        //reverse the given string using string builder function
        StringBuilder sb3=new StringBuilder("This method return the reversed object on which it was called");
        System.out.println("The original string is :" +sb3);
        sb3.reverse();
        System.out.println("The reverse String is :" +sb3);
    }
}
