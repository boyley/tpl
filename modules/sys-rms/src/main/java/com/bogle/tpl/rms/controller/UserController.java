package com.bogle.tpl.rms.controller;

import com.bogle.tpl.rms.domain.User;
import com.bogle.tpl.rms.error.UserException;
import com.bogle.tpl.rms.service.impl.UserDetailsService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

/**
 * Created by Administrator on 2015/6/19.
 */
//@RestController
//@RequestMapping
public class UserController {

    @Inject
    private UserDetailsService userDetailsService;

    @RequestMapping(value="/register",method= RequestMethod.POST)
    public ModelAndView register(@Validated User user,BindingResult br) {
        ModelAndView modelAndView = new ModelAndView();
        if(br.hasErrors()) {
            modelAndView.setViewName("/sign/register");
            return modelAndView;
        }
        userDetailsService.insertSelective(user);
        modelAndView.setViewName("redirect:/login");
        return modelAndView;
    }

    @RequestMapping(value="/register",method= RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(new User());
        modelAndView.setViewName("sign/register");
        return  modelAndView;
    }

    @ExceptionHandler(UserException.class)
    public ModelAndView handleAllException(UserException ex) {
        ModelAndView model = new ModelAndView("sign/register");
        model.addObject(new User());
        model.addObject("errMsg", ex);
        return model;

    }
}
