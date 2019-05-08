package nl.yer.Relationships.Persistance;

import nl.yer.Relationships.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
