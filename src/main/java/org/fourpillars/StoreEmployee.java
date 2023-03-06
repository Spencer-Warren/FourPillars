package org.fourpillars;

public class StoreEmployee extends  Person {
    private String employeeId;

    /*
     * Inheritance
     * The Employee class inherits the fields and methods from the Person class
     * It inherits all the functionality of the Person class
     */
    public StoreEmployee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void displayJob() {
        System.out.print("Job: Employee");
    }

    public String getEmployeeId() {
        return employeeId;
    }
    /*
     * Polymorphism
     * This method is overloaded,
     * has the same name but different parameters
     * This is an example of static polymorphism
     */
    public String getEmployeeId(String prefix) {
        return prefix + employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                "} " + super.toString();
    }
}
