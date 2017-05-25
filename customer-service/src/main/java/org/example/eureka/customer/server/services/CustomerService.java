package org.example.eureka.customer.server.services;

import org.example.eureka.customer.server.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Customer data getting interface
 */
public interface CustomerService {
    /**
     * Get data by customer identification number
     * @param id - identification number
     * @return @{@link org.example.eureka.customer.server.model.Customer}
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = "application/json")
    Customer getCustomer(@PathVariable("id") int id);
}