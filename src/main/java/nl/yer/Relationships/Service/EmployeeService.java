package nl.yer.Relationships.Service;

import nl.yer.Relationships.Model.Employee;
import nl.yer.Relationships.Persistance.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public <S extends Employee> S save(S entity) {
        return employeeRepository.save(entity);
    }

    public Optional<Employee> findById(Long aLong) {
        return employeeRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        employeeRepository.deleteById(aLong);
    }
}
