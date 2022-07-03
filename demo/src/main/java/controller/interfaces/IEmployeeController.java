package controller.interfaces;

import dto.DepartmentDto;
import dto.NameDto;
import dto.StatusDto;
import enums.Status;
import model.Employee;

public interface IEmployeeController {

    //crear un nuevo empleado
    public Employee addNewEmployee(Employee employee);

    //cambiar el estatus del empleado
    public void changeEmployeeStatus(Integer employeeId, StatusDto status);

    //actualizar el nombre del empleado
    public void changeEmployeeName(Integer employeeId, NameDto name);

    //actualizar el departamento del empleado
    public void changeEmployeeDepartment(Integer employeeId, DepartmentDto department);
}
