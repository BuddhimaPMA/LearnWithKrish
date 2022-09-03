public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"001","Buddhima","932130448v","Matara" );
        Employee employee2 = new Employee(1,"001","Buddhima","932130448v","Matara" );
        Employee employee3 = new Employee(2,"001","Buddhima","932130448v","Matara" );

        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.equals(employee1));
        System.out.println(employee1.equals(employee3));
        System.out.println(employee2.equals(employee3));
        System.out.println("\n ......................\n WHY IMMUTABLE MATTERS IN JAVA :");
        /**
         * following example is related to why IMMUTABLE matters in the Java.
         */
        String name = "john";
        String name2 = "john";
        String name3 = new String("john");

        System.out.println(name2==name);
        System.out.println(name3==name);
        System.out.println(name2.equals(name3));

    }
}
