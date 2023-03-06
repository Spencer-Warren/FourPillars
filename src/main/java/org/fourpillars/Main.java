package org.fourpillars;

/**
 * Hello world!
 *
 */
public class Main {
    public static void run() {
        StoreEmployee employee = new StoreEmployee("John", 25, "123");
        Boss boss = new Boss("Jane", 30, "456");

        System.out.println(employee);
        System.out.println(boss);

        employee.displayJob();
        boss.displayJob();

        System.out.println(employee.getEmployeeId("EMP-"));
    }

    public static void main( String[] args ) {
        run();
    }
}
