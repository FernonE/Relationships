package nl.yer.Relationships.API;

import nl.yer.Relationships.Service.EmployeeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Employee")
public class EmployeeController {

    private EmployeeService employeeService;
}
