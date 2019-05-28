package app.dhananjay.springbankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static app.dhananjay.springbankapp.config.ViewNameConstants.*;

@Controller
public class AccountController {

    @RequestMapping("/bankapp/home")
    public String showHomePage() {
        return VIEW_HOME_PAGE;
    }

    @RequestMapping("/bankapp/new")
    public String newAccount() {
        return VIEW_NEW_ACCOUNT_PAGE;
    }
}
