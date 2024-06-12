package com.multi.chap02crud.controller;

import com.multi.chap02crud.model.dto.CategoryDTO;
import com.multi.chap02crud.model.dto.MenuDTO;
import com.multi.chap02crud.model.service.MenuService;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;
    private final MessageSource messageSource;

    // 하나만 있을때는 Autowired 걸어도 되고 안걸어도 됨?
    public MenuController(MenuService menuService, MessageSource messageSource) {
        this.menuService = menuService;
        this.messageSource = messageSource;
    }


    @GetMapping("/list")
    public ModelAndView findMenuList(ModelAndView mv){  // model and view 써서 데이터 가져옴

        List<MenuDTO> menuList = menuService.findAllMenu();
        menuList.forEach((menu -> System.out.println("menu = " + menu)));

        mv.addObject("menuList", menuList);
        mv.setViewName("menu/list");


        return mv;
    }


    @GetMapping(value="category", produces = "application/json; charset=UTF-8") // 뒤는 반환할타입
    @ResponseBody
    public List<CategoryDTO> findAllCategory(){
        return menuService.findAllCategory();
    }

    // 화면 전환
    @GetMapping("regist")
    public void registPage(){}

    @PostMapping("regist")
    public ModelAndView registMenu(ModelAndView mv, MenuDTO newMenu, RedirectAttributes rttr, Locale locale) throws Exception {
        menuService.registMenu(newMenu);
        mv.setViewName("redirect:/menu/list");
        // 그냥 할 때
        // rttr.addFlashAttribute("successMessage","신규메뉴 등록에 성공하셨습니다.");
        // 로케일 설정에 따라 메세지 띄워지도록
        rttr.addFlashAttribute("successMessage", messageSource.getMessage("registMenu", null,locale));

        return mv;
    }
}
