package org.java17faetures.demo.records;

public class RecordsDemo {
    public static void main(String[] args) {
        EmployeeClass employeeClass = new EmployeeClass(100L,"Chris");
        System.out.println(employeeClass);
        EmployeeRecord employeeRecord = new EmployeeRecord(200L,"Peter");
        System.out.println(employeeRecord);
    }
}
