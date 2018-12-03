package netcracker.nchostel.dao;

import netcracker.nchostel.domain.Customer;


import java.util.List;


public interface CustomerDAO {
    public void addCustomer(Customer customer);

    public List<Customer> listCustomer();

    public void removeCustomer(Integer id);

    public void updateCustomer(Customer customer);
}
