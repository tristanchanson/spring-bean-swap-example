package com.tristanchanson.service.mock;

import org.springframework.aop.target.HotSwappableTargetSource;

/**
 * This class was created to give it a new type so the Spring Bean
 * Doesn't conflict with any other hot swappable objects
 */

public class HotSwappableService extends HotSwappableTargetSource {

    public HotSwappableService(Object initialTarget) {
        super(initialTarget);
    }

}
