package com.tristanchanson.service;

/**
 * Created by Tristan on 6/27/15.
 */
@org.springframework.stereotype.Service
public class RealService implements Service {
    public String print() {
        return "REAL";
    }
}
