package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addCustomer(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
    }

    @SuppressWarnings("unchecked")
    public List<Customer> listCustomer() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Customer");
        return query.list();
    }

    public void removeCustomer(Integer id) {
        Customer customer = (Customer) sessionFactory.getCurrentSession().load(Customer.class, id);
        if (null != customer) {
            sessionFactory.getCurrentSession().delete(customer);
        }
    }

    public void updateCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        Customer eCustomer = session.get(Customer.class, customer.getCustomerID());
        session.update(eCustomer);
    }
}