public class AppRunnable {
    public static void main(String[] args) {
        PrinterRunnable printerRunnable =new PrinterRunnable();
        Thread thread = new Thread(printerRunnable);
        Thread thread1 = new Thread("user");
        Thread thread2 = new Thread(printerRunnable,"user1");
        /**
         * There are 8 different ways of overloaded constructor in Thread class
         */
//        thread.start();
        thread1.start();
//        thread2.start();
        for (int i=0; i<=10; i++)
            System.out.println("Main class "+Thread.currentThread().getName()+" "+i);
    }
}
