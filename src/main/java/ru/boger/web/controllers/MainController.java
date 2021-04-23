package ru.boger.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.boger.web.models.Employee;

import javax.validation.Valid;

@Controller
public class MainController {
    @RequestMapping("/")
    public String askName(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @RequestMapping("/showName")
    public String showName(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "index";
        else
            return "greeting";
    }
}
