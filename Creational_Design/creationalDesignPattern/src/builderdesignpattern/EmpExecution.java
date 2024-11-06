package builderdesignpattern;

/**
 * Demonstrates the creation of an Employee instance using the Builder Design Pattern.
 * <p>
 * This class contains a main method to show case the usage of the EmployeeBuilder class to
 * construct an Employee object with selected attributes.
 * </p>
 */
public class EmpExecution {
    /**
     * The main method to execute the Employee creation example.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Employee eb = Employee.EmployeeBuilder.getEmployeeBuilder()
                .setFirstName("Uday")
                .setLastName("KV")
                .setPhoneNumber("987654321")
                .setEmail("abc@gmail.com")
                .Build();

        System.out.println(eb.getFirstName());
    }
}

