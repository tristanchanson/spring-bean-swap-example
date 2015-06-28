package com.tristanchanson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is an Example use of the interface
 */

@RestController
public class ServiceController {

    @Autowired Service service;
    
    @RequestMapping("/")
    public String index() {
        return service.print();
    }
    
}
