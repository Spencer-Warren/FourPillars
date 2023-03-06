package org.fourpillars;

public class Person extends Employee{

    /* Encapsulation
     * The fields are private and only accessible through the getters and setters
     * The user will not be able to directly access the fields
     * This means we can use code to validate data
     * or change the data before it is returned
     *
     * For example, we can check if the given age is negative
     * and throw an exception if it is
     */

    private String name;
    private int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void displayJob() {
        System.out.print("Job: Unemployed");
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
