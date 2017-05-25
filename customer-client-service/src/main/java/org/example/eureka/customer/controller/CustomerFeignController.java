package org.example.eureka.customer.controller;

import org.example.eureka.customer.model.Customer;
import org.example.eureka.customer.services.CustomerServiceFeignClient;
import org.example.eureka.customer.tools.MessageWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for getting customer with using Feign
 */
@RestController
public class CustomerFeignController {
    /**
     * Feign proxy service. Please notice that we defined the service declarative without any additional implementation.
     */
    @Autowired
    private CustomerServiceFeignClient customerServiceFeignClient;

    /**
     * Service the request
     * @param id - customer indentification number
     * @return @{@link Customer}
     */
    @RequestMapping(value = "/customer-client-feign/{id}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper<Customer> getCustomer(@PathVariable int id) {
        return new MessageWrapper<>(
                customerServiceFeignClient.getCustomer(id),
                "server called using eureka with feign");
    }

}