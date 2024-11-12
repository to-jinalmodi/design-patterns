package creational.singleton;

/**
 * Execute Database singleton class.
 */
public class MultiThreaded {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();

    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {

            Database database = Database.getInstance();
            System.out.println(database.getProperty());

        }

    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {

            Database database = Database.getInstance();
            System.out.println(database.getProperty());

        }

    }

}
