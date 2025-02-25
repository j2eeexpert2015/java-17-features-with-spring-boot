package org.java17faetures.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long salary;

    public Employee() {}

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Long getSalary() { return salary; }
}

