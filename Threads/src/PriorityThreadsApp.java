public class PriorityThreadsApp {
    /**
     * In this class we gonna talk about priority of Threads.
     * Threads are not a ranking system, It is value based system
     * Maximum priority = 10
     * Minimum priority = 1
     * When we declare a main Thread it will add 5 as default priority. All child threads inherit the priority value from the main thread. So we can not say the priority value of thread also will be 5.
     *
     * when we set the priority value 1>x or x>10 , ti will give a runtime error called IllegalArgumentException
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        PrinterRunnable printerRunnable = new PrinterRunnable();
        Thread thread = new Thread(printerRunnable);
        thread.start();
        System.out.println(thread.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        /**
         * run child thread priority to 10
         */

        thread.setPriority(10);
        System.out.println(thread.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        /**
         * main thread priority = 5 & Child thread priority = 1
         */

//        thread.setPriority(1);
//        System.out.println(thread.getPriority());
//        System.out.println(Thread.currentThread().getPriority());

        /**
         * will give a runtime exception (IllegalArgumentException)
         */

//        thread.setPriority(0);
//        System.out.println(thread.getPriority());
//        System.out.println(Thread.currentThread().getPriority());

        /**
         * This is how to set a priority to main thread (Current working Thread)
         */

//        Thread.currentThread().setPriority(1);

        for(int i = 0; i<=10; i++){
            System.out.println("Main thread "+i);

        }

    }
}
