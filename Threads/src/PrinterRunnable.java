public class PrinterRunnable implements Runnable {

    /**
     * Not like extends Thread, the run method must be override in this class. Otherwise it will give error message.
     *
     * in this case, we should pass the instance of this class to thread class. Because runnable doe not have start() method. Without start method the child thread won't be start.
     */
    @Override
    public void run() {

        for(int i=0; i<=100; i++) {
            System.out.println("Child class " + Thread.currentThread().getName() + " " + i);
            try {
                /**
                 * Thread.sleep() for check join implementation with millisecond in App class
                 */
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
