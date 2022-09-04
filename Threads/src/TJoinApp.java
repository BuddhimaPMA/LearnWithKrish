public class TJoinApp {
    /**
     * In this class we will show how java life cycle going and Join Method implementation
     *
     * In theread we have four stages.
     * 1. Start
     * 2. Ready / Runnable
     * 3. Running
     * 4  Dead
     * When the thread go to the dead state there is no come back
     *
     * ------------
     * About Join() Method
     * There are TWO ways implementation of thread join()
     *  1. Wait until child thread finished its work
     *  2. Give child thread to time-out to finish its work
     *
     * -------------
     * Thread join() has 3 overloaded methods.
     *  1. join() - wait until child does their job
     *  2. join(long millisecond) - give time out to child
     *  3. join(long millisecond, int nanosecond) - give time out with nanoseconds to child
     *
     *  IF ANY THREAD ON ITS WAITING STATE< THERE IS NO GO BACK TO THE RUNNING STATE< END OF THE DAY IT GOES TO THE READY/RUNNABLE STATE.
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        PrinterRunnable printerRunnable = new PrinterRunnable();
        Thread thread = new Thread(printerRunnable);
        System.out.println(thread.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        thread.start();
        /**
         * when you compile this, you can see the main thread wait until child thread done their job.
         */
//        thread.join();
        /**
         * you can implement this as follows also;
         * Wait until 500 sec and do main thread's job after the given time. Won't wait until child done their job
         *      5000ms -> 5sec
         */
        thread.join(100);
//        thread.join(500,500);

        for(int i=1; i<=10; i++)
            System.out.println("Main thread "+i);



    }
}
