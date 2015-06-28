package com.tristanchanson.service.mock;

import com.tristanchanson.service.Service;

/**
 * Created by Tristan on 6/27/15.
 */
@org.springframework.stereotype.Service
public class MockService implements Service {
    public String print() {
        return "MOCK";
    }
}
