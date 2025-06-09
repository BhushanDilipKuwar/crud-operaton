package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class Controller {


        private final EmployeeService service;

        public EmployeeController(EmployeeService service) {
            this.service = service;
        }

        @GetMapping
        public List<Employee> getAllEmployees() {
            return service.getAll();
        }

        @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable Long id) {
            return service.getById(id).orElseThrow(() -> new RuntimeException("Not found"));
        }

        @PostMapping
        public Employee createEmployee(@RequestBody Employee employee) {
            return service.create(employee);
        }

        @PutMapping("/{id}")
        public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
            return service.update(id, employee);
        }

        @DeleteMapping("/{id}")
        public void deleteEmployee(@PathVariable Long id) {
            service.delete(id);
        }
    }
}
