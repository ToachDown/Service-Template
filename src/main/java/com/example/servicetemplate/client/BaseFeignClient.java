package com.example.servicetemplate.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "base", name = "base")
public interface BaseFeignClient {
}
