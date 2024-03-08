package SpringTutorial.emsBackend.repository;

import SpringTutorial.emsBackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
