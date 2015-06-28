package com.tristanchanson.service.mock;

import com.tristanchanson.service.Service;

/**
 * This Class represents the MockService Implementation
 */
@org.springframework.stereotype.Service
public class MockService implements Service {
    public String print() {
        return "MOCK";
    }
}
