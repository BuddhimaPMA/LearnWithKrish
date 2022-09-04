public class PrinterExtends extends Thread{
    /**
     * in this method we need to implement what we need run whn the thread start() method is called by the main class.
     *
     * we can run this class without overriding the run() method, then what happen is it will go to the main class run() method and do nothing. because main class (Thread class)
     * run() method does not contain anything to print.
     */
    @Override
    public void run() {
        /**
         * when you call super.run() from this, it will go to the Threads run method and comeback to this thread class's run() method
         */
        super.run();
        for(int i=1; i<=50; i++)
            System.out.println("child thread :"+i);
    }
}
