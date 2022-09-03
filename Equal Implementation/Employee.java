import java.util.Objects;

public class Employee {

    private final int id;
    private final String code;

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    private String name;
    private String nic;
    private String address;

    /**
     * Constructor (overloaded)
     * @param id - int value
     * @param code - int value
     * @param name - String
     * @param nic - String
     * @param address - String
     */

    public Employee(int id, String code, String name, String nic, String address) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    /**
     *
     * @param obj - pass Instance of the Employee class object trough this parameter.
     *            By == operator; it will match the memory location value and pass whether the input value is true of false. (get reference value)
     * @return
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Employee)
            if(this.id == ((Employee) obj).getId() && this.code == ((Employee) obj).getCode()){

                System.out.println(this.id +" instance value :"+((Employee) obj).getId());
                System.out.println(this.code +" instance value :"+((Employee) obj).getCode());
                return true;

            }

        return false;
    }

}
