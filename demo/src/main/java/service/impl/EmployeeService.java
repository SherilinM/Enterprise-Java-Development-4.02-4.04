package service.impl;

import enums.Status;
import model.Employee;
import repository.EmployeeRepository;
import service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Crar la ruta del nuevo empleado
    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    //cambiar la ruta del empleado
    public void changeEmployeeStatus(Integer employeeId, Status status) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()){
            employee.get().setStatus(status);
            employeeRepository.save(employee.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }

    //crear la ruta - cambiar el nombre del empleado
    public void changeEmployeeName(Integer employeeId, String name) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()){
            employee.get().setName(name);
            employeeRepository.save(employee.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }

    //crear la ruta - cambiar el departamento
    public void changeEmployeeDepartment(Integer employeeId, String department) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()){
            employee.get().setDepartment(department);
            employeeRepository.save(employee.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }
}