public class ExampleInstanceOf {
    public static void main(String[] args) {
        ExampleInstanceOf exampleInstanceOf =new ExampleInstanceOf();
        /**
         * This will print output as True.
         *
         * The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or instance).
         * Also known as TYPE COMPARISON Operator. Because, It compares Instance with the Type.
         */
        System.out.println(exampleInstanceOf instanceof ExampleInstanceOf);

        //-----------------------------------------------------

        InstanceOfChild instanceOfChild = new InstanceOfChild();
        System.out.println(instanceOfChild instanceof ExampleInstanceOf);
        /**
         * will print True as an output
         */
//        System.out.println(exampleInstanceOf instanceof Employee);
        /**
         * Above print statement can not be print, it will give error while declaring.
         * Error : Can not cast exampleInstanceOf to Employee
         */

    }
}
