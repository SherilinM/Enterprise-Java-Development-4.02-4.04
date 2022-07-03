package service.interfaces;

import enums.Status;
import model.Employee;

public interface IEmployeeService {

    //crear la ruta agregar nuevo paciente
    public Employee addNewEmployee(Employee employee);

    //crear la ruta cambiar el estatus del empleado
    public void changeEmployeeStatus(Integer employeeId, Status status);

    //crear la ruta cambiar el nombre del emnpleadp
    public void changeEmployeeName(Integer employeeId, String name);

    //crear la ruta cambiar el departamento del empleado
    public void changeEmployeeDepartment(Integer employeeId, String department);
}