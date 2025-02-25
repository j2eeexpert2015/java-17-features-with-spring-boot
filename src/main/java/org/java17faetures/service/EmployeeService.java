package org.java17faetures.service;


import jakarta.annotation.PostConstruct;
import org.java17faetures.demo.records.EmployeeRecord;
import org.java17faetures.entity.Employee;
import org.java17faetures.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Automatically populate DB on startup
    @PostConstruct
    public void initDB() {
        repository.save(new Employee("Alice Johnson", 60000L));
        repository.save(new Employee("Bob Smith", 75000L));
        repository.save(new Employee("Charlie Brown", 50000L));
    }

    public List<EmployeeRecord> getAllEmployees() {
        return repository.findAll().stream()
                .map(emp -> new EmployeeRecord(emp.getId(), emp.getName()))
                .collect(Collectors.toList());
    }


}

