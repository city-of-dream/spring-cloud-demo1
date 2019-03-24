package com.client.demo.feign;

import com.client.demo.feign.fallback.FeignServiceImpl;
import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "server-demo",fallback = FeignServiceImpl.class,configuration = FeignService.UserFeignConfig.class)
public interface FeignService {
    @RequestMapping(method = RequestMethod.GET, value = "/server-demo/server")
    String getStores();

    class UserFeignConfig {
        @Bean
        public Logger.Level logger() {
            return Logger.Level.FULL;
        }
    }

}