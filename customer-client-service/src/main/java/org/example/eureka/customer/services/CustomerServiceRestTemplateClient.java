package org.example.eureka.customer.services;

import org.example.eureka.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Service to obtain a customer with direct call but with usage of Eureka Service Discovery
 */
@Component
public class CustomerServiceRestTemplateClient {

    @Autowired
    private RestTemplate restTemplate;

    public Customer getCustomer(int id) {

        return restTemplate.exchange(
                "http://customer-service/customer/{id}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Customer>() {},
                id).getBody();
    }

}