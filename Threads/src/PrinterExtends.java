public class PrinterExtends extends Thread{
    /**
     * in this method we need to implement what we need run whn the thread start() method is called by the main class.
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
