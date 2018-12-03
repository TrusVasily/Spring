package netcracker.nchostel.service;

import netcracker.nchostel.domain.Customer;

import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer customer);

    public List<Customer> listCustomer();

    public void removeCustomer(Integer id);

    public void updateCustomer(Customer customer);
}
