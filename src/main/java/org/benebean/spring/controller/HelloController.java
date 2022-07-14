package org.benebean.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/hello")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, String> hello() {
        logger.info("HelloController:" + this.getClass() + " is initialized!");
        Map<String, String> res = new HashMap<>();
        res.put("data", "Hello Client!");

        return res;
    }

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    public String string() {
        logger.info("HelloController:" + this.getClass() + " is initialized!");

        return "response from server";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public Map<String, String> json() {
        logger.info("HelloController:" + this.getClass() + " is initialized!");
        Map<String, String> res = new HashMap<>();
        res.put("data", "response from server");
        return res;
    }

}