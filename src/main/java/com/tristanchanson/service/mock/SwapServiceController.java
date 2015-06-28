package com.tristanchanson.service.mock;

import com.tristanchanson.service.RealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is an Example of how to swap the underlying Bean at Runtime.
 */

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
