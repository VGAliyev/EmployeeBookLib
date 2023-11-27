package pro.sky.course2.v.aliyev.employeebookstreams.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.v.aliyev.employeebookstreams.model.Employee;
import pro.sky.course2.v.aliyev.employeebookstreams.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("add")
    public ResponseEntity<Employee> add(@RequestParam String firstName, @RequestParam String lastName,
                                      @RequestParam float salary, @RequestParam int departmentId) {
        Employee employee = employeeService.add(firstName, lastName, salary, departmentId);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(employee);
    }

    @RequestMapping("remove")
    public ResponseEntity<Employee> remove(@RequestParam String firstName, @RequestParam String lastName) {
        Employee employee = employeeService.remove(firstName, lastName);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(employee);
    }

    @RequestMapping("find")
    public ResponseEntity<Employee> find(@RequestParam String firstName, @RequestParam String lastName) {
        Employee employee = employeeService.find(firstName, lastName);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(employee);
    }

    @RequestMapping()
    public Collection<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
