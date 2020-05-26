package com.concert.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author fgh
 * @version 1.0
 * @date 2020/5/26 11:52
 */
@RestController
@RequestMapping("/")
public class ShopServiceController {

    private final RestTemplate restTemplate;

    @Autowired
    public ShopServiceController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/test")
    public String sayHello(@RequestParam("name") String name) {
        System.out.println("name = " + name);
        return restTemplate.getForObject("http://service-provider/sayHello?name=" + name, String.class);
    }

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
    }
}
