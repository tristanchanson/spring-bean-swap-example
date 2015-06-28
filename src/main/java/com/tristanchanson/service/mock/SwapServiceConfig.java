package com.tristanchanson.service.mock;

import com.tristanchanson.service.RealService;
import com.tristanchanson.service.Service;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SwapServiceConfig {

    @Bean
    public HotSwappableService hotSwappableService(RealService realService) {
        return new HotSwappableService(realService);
    }

    @Bean
    @Primary
    public ProxyFactoryBean proxyFactoryBean(HotSwappableService hotSwappableService) {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTargetSource(hotSwappableService);
        proxyFactoryBean.setInterfaces(Service.class);
        return proxyFactoryBean;
    }

}
