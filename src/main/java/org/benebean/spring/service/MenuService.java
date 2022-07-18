package org.benebean.spring.service;

import org.benebean.spring.dao.MenuRepository;
import org.benebean.spring.domain.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenu() {

        return menuRepository.findAll();
    }

}
