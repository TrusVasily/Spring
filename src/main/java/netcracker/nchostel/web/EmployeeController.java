package netcracker.nchostel.web;

import netcracker.nchostel.domain.Employee;
import netcracker.nchostel.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/Employee")
    public String listEmployee(Map<String, Object> map) {

        map.put("employee", new Employee());
        map.put("employeeList", employeeService.listEmployee());

        return "Employee";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee") Employee employee) {

        if (employee.getEmployeeID() == 0) {
            employeeService.addEmployee(employee);
        } else {
            employeeService.updateEmployee(employee);
        }

        return "redirect:/Employee";
    }

    @RequestMapping("/deleteEmployee/{employeeID}")
    public String deleteEmployee(@PathVariable("employeeID") Integer employeeID) {

        employeeService.removeEmployee(employeeID);
        return "redirect:/Employee";
    }

    @RequestMapping(value = "/updateEmployee", method = {RequestMethod.POST, RequestMethod.GET})
    public String updateEmployee(@ModelAttribute("employee") Employee employee) {

        employeeService.updateEmployee(employee);
        return "redirect:/Employee";
    }
}
