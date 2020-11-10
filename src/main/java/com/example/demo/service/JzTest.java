package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: jz
 * @Date: 2020/11/3 14:38
 * @Description:
 */
@Controller
public class JzTest {
    public @Value("${test.jz.name:未找到name属性}") String name;




    @GetMapping("/index")
    public ModelAndView index() {
      ModelAndView mv = new ModelAndView("redirect:/index.html");
        return mv;
    }


}
