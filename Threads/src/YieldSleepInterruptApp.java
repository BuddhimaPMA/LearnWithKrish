public class YieldSleepInterruptApp {
    /**
     * In this class will show you how threads behaviours
     * yield() method - allow to other threads to done there job
     * sleep() method - can be waiting for certain given time
     * interrupt() method - if the thread in  waiting state it will interrupt and wake up for done their job. When interrupt happened it will give a runtime exception. (InterruptedException)
     * @param args
     */
    public static void main(String[] args) {
        PrinterYSI printerYSI = new PrinterYSI();
        Thread thread = new Thread(printerYSI);
        thread.start();
        thread.interrupt();

        for (int i=1; i<10; i++)
            System.out.println("Main "+i);

    }
}
