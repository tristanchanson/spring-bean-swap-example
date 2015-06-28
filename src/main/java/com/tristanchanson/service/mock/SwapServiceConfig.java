package com.tristanchanson.service.mock;

import com.tristanchanson.service.RealService;
import com.tristanchanson.service.Service;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *  This is the Configuration class for the spring beans that support the hot swappable beans
 */

@Configuration
public class SwapServiceConfig {

    /*
        This Bean creates a new Singleton of our Hot Swappable Service Proxy
        Setting the Real Service Implementation as the class injected at startup
     */
    @Bean
    public HotSwappableService hotSwappableService(RealService realService) {
        return new HotSwappableService(realService);
    }

    /*
        This Bean creates/configures the Proxy Factory
        The Hot Swappable Service Bean is injected and added as the target source
        The Service interface that is shared with the Real and Mock Service is added to Proxy
        This configures an AOP Advice that will route actions on the interface
        to the current Target Source
     */
    @Bean
    @Primary
    public ProxyFactoryBean proxyFactoryBean(HotSwappableService hotSwappableService) {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTargetSource(hotSwappableService);
        proxyFactoryBean.setInterfaces(Service.class);
        return proxyFactoryBean;
    }

}
