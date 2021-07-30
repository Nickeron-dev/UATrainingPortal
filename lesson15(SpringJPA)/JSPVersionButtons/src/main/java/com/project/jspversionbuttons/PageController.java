package com.project.jspversionbuttons;

import com.project.jspversionbuttons.view.TextConstantsPaths;
import com.project.jspversionbuttons.view.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class PageController {
    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("register", View.bundle.getString(TextConstantsPaths.REGISTER_BUTTON));
        model.addAttribute("login", View.bundle.getString(TextConstantsPaths.LOGIN_BUTTON));
        return "welcome";
    }

    @RequestMapping(value="/change-language", params="ukr", method= RequestMethod.POST)
    public RedirectView ukr() {
        View.changeLocale(Optional.of("ua"));
        return new RedirectView("/");
    }

    @RequestMapping(value="/change-language", params="eng", method= RequestMethod.POST)
    public RedirectView eng() {
        View.changeLocale(Optional.of("en"));
        return new RedirectView("/");
    }
}
