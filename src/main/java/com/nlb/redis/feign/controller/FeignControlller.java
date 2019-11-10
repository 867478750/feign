package com.nlb.redis.feign.controller;

import com.nlb.redis.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignControlller {

    @Autowired
    FeignService feignService;

    @GetMapping("redislock")
    public void redisLock(){
        feignService.buy();
    }

    @GetMapping("redislock2")
    public void redisLock2(){
        feignService.buy1();
    }

}
