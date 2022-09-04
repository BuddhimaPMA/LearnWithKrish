public class App {
    public static void main(String[] args) {
        /**
         * following code segment for Thread extends class declaration.
         */
        PrinterExtends printer = new PrinterExtends();
        printer.start();
        for(int i=1; i<=10; i++)
            System.out.println("main thread :"+i);
    }
}
