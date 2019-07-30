package com.daka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2019/07/19
 * Time: 下午10:44
 *
 * @author manqs
 */

@RestController
@RequestMapping("/daka")
public class HellowController {

    @RequestMapping(value = "/hello", name = "hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}