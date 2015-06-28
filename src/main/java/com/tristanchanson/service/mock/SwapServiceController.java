package com.tristanchanson.service.mock;

import com.tristanchanson.service.RealService;
import com.tristanchanson.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwapServiceController {

    @Autowired
    HotSwappableService hotSwappableService;
    @Autowired MockService mockService;
    @Autowired RealService realService;

    @RequestMapping("/swap")
    public String swap() {

        if (hotSwappableService.getTarget() instanceof RealService) {
            hotSwappableService.swap(mockService);
        } else {
            hotSwappableService.swap(realService);
        }

        return "Service Swap Success";
    }
    
}
