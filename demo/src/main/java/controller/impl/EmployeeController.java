package controller.impl;
import controller.interfaces.IEmployeeController;
import dto.DepartmentDto;
import dto.NameDto;
import dto.StatusDto;
import model.Employee;
import service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    //crear un nuevo paciente
    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addNewEmployee(@RequestBody Employee employee) {
        return employeeService.addNewEmployee(employee);
    }

    //cambiar el status del employee
    @PatchMapping("/employee-status/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeEmployeeStatus(@PathVariable Integer employeeId, @RequestBody StatusDto status){
        employeeService.changeEmployeeStatus(employeeId, status.getStatus());
    }

    //actualizar el nombre del empleado
    @PatchMapping("employee-name/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeEmployeeName(@PathVariable Integer employeeId, @RequestBody NameDto name) {
        employeeService.changeEmployeeName(employeeId, name.getName());
    }

    //actualizar el departamento del empleado
    @PatchMapping("/employee-department/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeEmployeeDepartment(@PathVariable Integer employeeId, @RequestBody DepartmentDto department) {
        employeeService.changeEmployeeDepartment(employeeId, department.getDepartment());
    }
}

