package netcracker.nchostel.service;

import netcracker.nchostel.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List<Employee> listEmployee();

    public void removeEmployee(Integer id);

    public void updateEmployee(Employee employee);
}
