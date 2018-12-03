package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Employee;

import java.util.List;

public interface EmployeeDAO {
    public void addEmployee(Employee booking);

    public List<Employee> listEmployee();

    public void removeEmployee(Integer id);

    public void updateEmployee(Employee employee);
}
