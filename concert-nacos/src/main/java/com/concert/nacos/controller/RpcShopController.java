package com.concert.nacos.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author fgh
 * @version 1.0
 * @date 2020/5/26 17:46
 */
@RestController
@RequestMapping("/")
public class RpcShopController {
    @GetMapping("sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return "台湾嫩模：" + name;
    }
}

@RestController
class EchoController {
    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }
}
