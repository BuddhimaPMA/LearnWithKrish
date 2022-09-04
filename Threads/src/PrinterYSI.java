public class PrinterYSI implements Runnable{
    @Override
    public void run() {

        for (int i=1; i<10;i++){
            try {
                Thread.sleep(500);
                System.out.println("Child "+i);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        }

    }
}
