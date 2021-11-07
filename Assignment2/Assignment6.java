package Assignment6;

public abstract class Persistence {
    abstract void persist();
}
package Assignment6;

public class DatabasePersistence extends  Persistence{
    void persist(){
        System.out.println("database persists");
    }
}
package Assignment6;

public class FilePersistence extends  Persistence{
    void persist() {
        System.out.println("file persists");
    }
}
package Assignment6;

public class MainApp4 {
    public static void main(String[] args) {
        Persistence p= new Persistence() {
            @Override    //ANNOYMOUSCLASS
            void persist() {
                System.out.println("calling it");
            }
        };
        p.persist();
    }
}

