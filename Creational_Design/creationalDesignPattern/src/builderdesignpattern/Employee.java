package builderdesignpattern;

/**
 * Represents an Employee entity with various personal and work-related details.
 * The Employee object is created using the EmployeeBuilder class to ensure immutability
 * and provide a flexible and readable way to set optional fields.
 * <p>
 * This class demonstrates the Builder Design Pattern, which is useful for creating complex objects
 * with multiple optional fields without needing numerous overloaded constructors.
 * </p>
 */
public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String department;
    private String jobTitle;
    private String dateOfBirth;
    private String maritalStatus;

    /**
     * Private constructor to be called by EmployeeBuilder.
     * Ensures that first name and last name are mandatory fields.
     * 
     * @param eb the builder object that contains the employee data
     * @throws IllegalArgumentException if firstName or lastName is null
     */
    public Employee(EmployeeBuilder eb) {
        if (eb.getFirstName() == null || eb.getLastName() == null)
            throw new IllegalArgumentException("First name and Last name are required");

        this.employeeId = eb.getEmployeeId();
        this.firstName = eb.getFirstName();
        this.lastName = eb.getLastName();
        this.gender = eb.getGender();
        this.address = eb.getAddress();
        this.phoneNumber = eb.getPhoneNumber();
        this.email = eb.getEmail();
        this.department = eb.getDepartment();
        this.jobTitle = eb.getJobTitle();
        this.dateOfBirth = eb.getDateOfBirth();
        this.maritalStatus = eb.getMaritalStatus();
    }

    // Getters and Setters for the Employee class

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * Builder class for Employee. Implements a fluent interface to allow easy and readable object creation.
     */
    public static class EmployeeBuilder {
        private int employeeId;
        private String firstName;
        private String lastName;
        private String gender;
        private String address;
        private String phoneNumber;
        private String email;
        private String department;
        private String jobTitle;
        private String dateOfBirth;
        private String maritalStatus;

        /**
         * Creates an Employee object using the values set in the builder.
         *
         * @return the constructed Employee object
         */
        public Employee Build() {
            return new Employee(this);
        }

        /**
         * Returns a new instance of EmployeeBuilder.
         *
         * @return a new EmployeeBuilder object
         */
        public static EmployeeBuilder getEmployeeBuilder() {
            return new EmployeeBuilder();
        }

        /**
         * Sets the employee ID.
         *
         * @param employeeId unique ID for the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        /**
         * Sets the first name of the employee.
         *
         * @param firstName first name of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets the last name of the employee.
         *
         * @param lastName last name of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets the gender of the employee.
         *
         * @param gender gender of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Sets the address of the employee.
         *
         * @param address address of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        /**
         * Sets the phone number of the employee.
         *
         * @param phoneNumber phone number of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Sets the email address of the employee.
         *
         * @param email email address of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Sets the department of the employee.
         *
         * @param department department of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        /**
         * Sets the job title of the employee.
         *
         * @param jobTitle job title of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        /**
         * Sets the date of birth of the employee.
         *
         * @param dateOfBirth date of birth of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Sets the marital status of the employee.
         *
         * @param maritalStatus marital status of the employee
         * @return the current EmployeeBuilder instance, allowing for method chaining
         */
        public EmployeeBuilder setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        // Getters...

        public int getEmployeeId() {
            return employeeId;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getGender() {
            return gender;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public String getDepartment() {
            return department;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public String getMaritalStatus() {
            return maritalStatus;
        }
    }
}
