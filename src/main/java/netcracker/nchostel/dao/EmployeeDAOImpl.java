package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void addEmployee(Employee employee) {
        sessionFactory.getCurrentSession().persist(employee);
    }

    @SuppressWarnings("unchecked")
    public List<Employee> listEmployee() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Employee");
        return query.list();
    }

    public void removeEmployee(Integer id) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        if (null != employee) {
            sessionFactory.getCurrentSession().delete(employee);
        }
    }

    public void updateEmployee(Employee Employee) {
        Session session = sessionFactory.getCurrentSession();
        Employee eEmployee = session.get(Employee.class, Employee.getEmployeeID());
        session.saveOrUpdate(eEmployee);
    }
}

