package org.example.eureka.customer.services;

import org.example.eureka.customer.model.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Interface extending for Feign to identify microservice
 */
@FeignClient(value = "customer-service")
public interface CustomerServiceFeignClient {
    /**
     * Get data by customer identification number
     * @param id - identification number
     * @return @{@link Customer}
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET, produces = "application/json")
    Customer getCustomer(@PathVariable("id") int id);
}
