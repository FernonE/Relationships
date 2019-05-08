package nl.yer.Relationships.API;

import nl.yer.Relationships.Model.Address;
import nl.yer.Relationships.Model.Employee;
import nl.yer.Relationships.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public Iterable<Employee> list() {
        return this.employeeService.findAll();
    }

    @PostMapping
    public Employee create (@RequestBody Employee employee,@RequestBody Address address) {
        return this.employeeService.save(employee);
    }
}
