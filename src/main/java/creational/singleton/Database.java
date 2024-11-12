package creational.singleton;

/**
 * Singleton is a creational design pattern,
 * which ensures that only one object of its kind exists and
 * provides a single point of access to it for any other code.
 */
public final class Database {

    // Database parameters
    private String property = "value";
    private static volatile Database instance;

    private Database() {

    }

    public String getProperty() {
        return this.property;
    }

    public static Database getInstance() {

        // Return instance if it is available
        if (null != instance) {
            return instance;
        }

        // Apply lock if multiple threads are trying to create instance
        synchronized(Database.class) {
            // Create instance if it is not available
            if (null == instance) {
                instance = new Database();
            }
            return instance;
        }

    }

}
