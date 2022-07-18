package org.benebean.spring.controller;

import org.benebean.spring.service.MenuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/menu")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<Object, Object> getAllMenu() {

        Map<Object, Object> res = new HashMap();
        res.put("data", menuService.getAllMenu());

        return res;
    }
}
