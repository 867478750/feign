package com.nlb.redis.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "lock")
public interface FeignService {
    @GetMapping("buy")
    public String buy();
}
