package org.java17faetures.controller;


import org.java17faetures.demo.records.EmployeeRecord;
import org.java17faetures.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EmployeeRecord> getAllEmployees() {
        return service.getAllEmployees();
    }

}
