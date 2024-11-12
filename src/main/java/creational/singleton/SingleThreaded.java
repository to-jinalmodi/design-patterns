package creational.singleton;

/**
 * Execute Database singleton class.
 */
public class SingleThreaded {

    public static void main(String[] args) {

        Database database = Database.getInstance();
        System.out.println(database.getProperty());

    }

}
