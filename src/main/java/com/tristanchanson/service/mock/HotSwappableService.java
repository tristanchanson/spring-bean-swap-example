package com.tristanchanson.service.mock;

import org.springframework.aop.target.HotSwappableTargetSource;

public class HotSwappableService extends HotSwappableTargetSource {

    public HotSwappableService(Object initialTarget) {
        super(initialTarget);
    }

}
