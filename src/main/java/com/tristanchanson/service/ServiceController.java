package com.tristanchanson.service;

import com.tristanchanson.service.mock.HotSwappableService;
import com.tristanchanson.service.mock.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired Service service;
    
    @RequestMapping("/")
    public String index() {
        return service.print();
    }
    
}
