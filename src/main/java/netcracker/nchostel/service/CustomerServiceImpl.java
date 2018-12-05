package netcracker.nchostel.service;

import netcracker.nchostel.dao.CustomerDAO;
import netcracker.nchostel.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    @Transactional
    public List<Customer> listCustomer() {
        return customerDAO.listCustomer();
    }

    @Transactional
    public void removeCustomer(Integer id) {
        customerDAO.removeCustomer(id);
    }

    @Transactional
    public void updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }
}
