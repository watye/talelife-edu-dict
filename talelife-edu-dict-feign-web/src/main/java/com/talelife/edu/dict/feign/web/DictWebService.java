package com.talelife.edu.dict.feign.web;

import org.springframework.cloud.openfeign.FeignClient;

import com.talelife.edu.dict.feign.web.fallback.DictWebFallback;

@FeignClient(name = "talelife-edu-dict-web", fallback = DictWebFallback.class)
public interface DictWebService {
}