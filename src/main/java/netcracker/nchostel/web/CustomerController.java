package netcracker.nchostel.web;

import netcracker.nchostel.domain.Customer;
import netcracker.nchostel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/Customer")
    public String listCustomer(Map<String, Object> map) {

        map.put("customer", new Customer());
        map.put("customerList", customerService.listCustomer());

        return "customer";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/Customer";
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") Customer customer,
                              BindingResult result) {

        customerService.addCustomer(customer);

        return "redirect:/Customer";
    }

    @RequestMapping("/deleteCustomer/{customerID}")
    public String deleteCustomer(@PathVariable("customerID") Integer customerID) {

        customerService.removeCustomer(customerID);

        return "redirect:/Customer";
    }

    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
    public String updateCustomer(@ModelAttribute("customer") Customer customer,
                              BindingResult result) {

        customerService.updateCustomer(customer);

        return "redirect:/Customer";
    }
}
