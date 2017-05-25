package org.example.eureka.customer.controller;

import org.example.eureka.customer.services.CustomerServiceRestTemplateClient;
import org.example.eureka.customer.tools.MessageWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classic Rest Controller
 */
@RestController
public class CustomerRestTemplateController {

    /**
     * The service has its own implementation
     */
    @Autowired
    private CustomerServiceRestTemplateClient customerServiceRestTemplateClient;

    @RequestMapping(value = "/customer-client/{id}", method = RequestMethod.GET, produces = "application/json")
    public MessageWrapper getCustomer(@PathVariable int id) {
        return new MessageWrapper<>(
                customerServiceRestTemplateClient.getCustomer(id),
                "server called using eureka with rest template"
        );
    }

}