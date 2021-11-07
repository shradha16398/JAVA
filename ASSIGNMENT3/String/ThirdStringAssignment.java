3.given string "Java String pool refers to collection of String which are stored in heap memory"perform following operations


package StringFunction;

public class StringDemo {
    public static void main(String[] args) {
        String str="Java String pool refers to collection of String which are stored in heap memory";
        //1.PRINT STRING TO CONSOLE IN LOWERCASE
        System.out.println("String is in lower case is" +str.toLowerCase());
        //2.PRINT STRING TO CONSOLE IN UPPERCASE
        System.out.println("String is in lower case is" +str.toUpperCase());
       //3. REPLACE ALL 'A' CHARACTER IN THE STRING WITH '$' SIGN
        String str2=str.replace('a','$');
        System.out.println("replace string is:\t"+str2);
        //4.AGAIN WE REPLACE OUR STRING TO ORIGINAL
        String str3=str.replace('$','a');
        System.out.println("replace string is:\t"+str3);
        //5.CHECK  WHETHER ORIGINAL STRIN CONTAIN 'COLLECTION' WORD OR NOT
        System.out.println("string contain collection:"+str.contains("collection"));
        //6.ACCEPT NEW STRING
         String str4="java string pool refers to collection of string which are stored in heap memory";
         //7.CHECK IF THE "java string pool refers to collection of string which are stored in heap memory" MATCHES TO ORIGINAL STRING
         System.out.println("USING EQUALS METHOD CHECKING STR3 IS EQUAL TO STR4:\t" +str3.equals(str4));
         //8.IF THE STRING DOES NOT MATCH CHECK IF THERE IS ANOTHER METHOD WHICH CAN BE USED TO CHECK IF THE STRINGS ARE EQUAL
        System.out.println("USING EQUALIGNORE CASE CHECKING STRING STR4 IS EQUAL TO STRING STR3:\t"+str3.equalsIgnoreCase(str4));


    }
}
