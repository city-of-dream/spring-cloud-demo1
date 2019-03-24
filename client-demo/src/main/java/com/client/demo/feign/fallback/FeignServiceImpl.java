package com.client.demo.feign.fallback;

import com.client.demo.feign.FeignService;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {
    @Override
    public String getStores() {
        return "fallback兜底处理>>>>";
    }
}
