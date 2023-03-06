package org.fourpillars;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class MainTest{
    private static PrintStream originalOut;
    private static ByteArrayOutputStream baos;

    @BeforeAll
    static void setUp() {
        originalOut = System.out;
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @AfterEach
    void tearDown() {
        baos.reset();
    }

    @AfterAll
    static void tearDownEnd() {
        System.setOut(originalOut);
    }

    @Test
    void bossTest() {
        Boss boss = new Boss("Jane", 30, "456");
        System.out.println(boss);

        assertEquals("Boss{bossId='456'} Person{name='Jane', age='30'}", baos.toString().trim());
        baos.reset();

        boss.displayJob();
        assertEquals("Job: Boss", baos.toString().trim());
        baos.reset();

        boss.setBossId("789");
        assertEquals("789", boss.getBossId());
    }

    @Test
    void employeeTest() {
        StoreEmployee employee = new StoreEmployee("John", 25, "123");
        System.out.println(employee);

        assertEquals("Employee{employeeId='123'} Person{name='John', age='25'}", baos.toString().trim());
        baos.reset();

        employee.displayJob();
        assertEquals("Job: Employee", baos.toString());
        baos.reset();

        employee.setEmployeeId("456");
        assertEquals("456", employee.getEmployeeId());
        assertEquals("EMP-456", employee.getEmployeeId("EMP-"));
    }

    @Test
    void personTest() {
        Person person = new Person("John", 25);

        assertEquals("Person{name='John', age='25'}", person.toString());
        baos.reset();

        person.displayJob();
        assertEquals("Job: Unemployed", baos.toString());

        person.setAge(30);
        assertEquals(30, person.getAge());

        person.setName("Jane");
        assertEquals("Jane", person.getName());
    }

    @Test
    void ageExceptionTest() {
        Person person = new Person("John", 25);
        assertThrows(IllegalArgumentException.class, () -> person.setAge(-1));
    }
}
