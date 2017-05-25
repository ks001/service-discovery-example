package org.example.eureka.customer.server.rest;

import org.example.eureka.customer.server.model.Customer;
import org.example.eureka.customer.server.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@RestController
public class CustomerController implements CustomerService {

    private static Logger logger = LoggerFactory.getLogger(CustomerController.class);

    /**
     * Customers collection
     */
    private List<Customer> customers = new LinkedList<>();

    /**
     * Default controller constructor
     */
    @PostConstruct
    private void initCollection() {
        customers.add(new Customer(1, "Peter", "Test"));
        customers.add(new Customer(2, "Lucas", "Test2"));
    }

    public Customer getCustomer(@PathVariable int id) {
        logger.debug(String.format("reading customer by id =%d", id));
        return customers.stream().filter(customer1 -> customer1.getId() == id).findFirst().get();
    }

}