package com.project.internalizationbuttons.controller;

import com.project.internalizationbuttons.view.TextConstantsPaths;
import com.project.internalizationbuttons.view.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

@Controller
public class PageController {

    @GetMapping({"/", "/hello"})
    public String hello(@RequestParam(value="name", defaultValue = "World",
    required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
/*
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "file";
    }

    @RequestMapping(value="/processForm",params="action1",method=RequestMethod.POST)
    public void action1()
    {
        System.out.println("Action1 block called");
    }
    @RequestMapping(value="/processForm",params="action2",method= RequestMethod.POST)
    public void action2()
    {
        System.out.println("Action2 block called");
    }*/

//    @GetMapping("/")
//    public String home(Model model) {
//        Map<String, String> attributes = new HashMap<>();
//        attributes.put("login", View.bundle.getString(TextConstantsPaths.LOGIN_BUTTON));
//        attributes.put("register", View.bundle.getString(TextConstantsPaths.REGISTER_BUTTON));
//        model.addAllAttributes(attributes);
//        //System.out.println(message);
//        return "index";
//    }
//    @RequestMapping(value = "/", params = "UKR")
//    public String homeUA(/*@ModelAttribute String message, Model model*/) {
//        View.changeLocale(Optional.of(new Locale("ua", "UA")));
////        Map<String, String> attributes = new HashMap<>();
////        attributes.put("login", View.bundle.getString(TextConstantsPaths.LOGIN_BUTTON));
////        attributes.put("register", View.bundle.getString(TextConstantsPaths.REGISTER_BUTTON));
////        model.addAllAttributes(attributes);
//        System.out.println("UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//        return "index";
//    }
//
//    @PostMapping(params = "en")
//    public String homeEN(@ModelAttribute String message, Model model) {
//        View.changeLocale(Optional.of(new Locale("en")));
////        Map<String, String> attributes = new HashMap<>();
////        attributes.put("login", View.bundle.getString(TextConstantsPaths.LOGIN_BUTTON));
////        attributes.put("register", View.bundle.getString(TextConstantsPaths.REGISTER_BUTTON));
////        model.addAllAttributes(attributes);
//        System.out.println("EN");
//        return "index";
//    }

}
