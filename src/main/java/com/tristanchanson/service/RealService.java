package com.tristanchanson.service;

/**
 * This Class represents the Real Service Implementation
 */
@org.springframework.stereotype.Service
public class RealService implements Service {
    public String print() {
        return "REAL";
    }
}
