package netcracker.nchostel.service;

import netcracker.nchostel.dao.EmployeeDAO;
import netcracker.nchostel.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Transactional
    public List<Employee> listEmployee() {
        return employeeDAO.listEmployee();
    }

    @Transactional
    public void removeEmployee(Integer id) {
        employeeDAO.removeEmployee(id);
    }

    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }
}
