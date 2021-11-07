package StringBuffer;

public class DDemoStringBuffer {
    public static void main(String[] args) {
        //WRITE AN APPLICATION TO APPEND THE FOLLOWING STRING "StringBuffer ","is a peer class of String","the functionality of string"
        StringBuffer sb=new StringBuffer("StringBuffer ");
        sb.append("is a peer class of String");
        sb.append("the functionality of string");
        System.out.println("The appended string is :" +sb);

       //INSERT THE FOLLOWING STRING "INSERT TEXT" INTO THE STRING "IT IS USED TO _" AT THE SPECIFIED INDEX POSITION" AT THE LOCTION DENOTED SIGN  _
        StringBuffer sb2=new StringBuffer("it is used to_  at the specified index position ");
        sb2.insert(14,"insert text");
        System.out.println("The index inserted string is :" +sb2);

        //reverse the given string using string buffer function
        StringBuffer sb3=new StringBuffer("This method return the reversed object on which it was called");
        System.out.println("The original string is :" +sb3);
        sb3.reverse();
        System.out.println("The reverse String is :" +sb3);

    }
}
