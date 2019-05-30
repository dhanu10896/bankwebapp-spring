package app.dhananjay.springbankapp.controllers;

import app.dhananjay.springbankapp.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import static app.dhananjay.springbankapp.config.ViewNameConstants.*;

@Controller
public class AccountController {

    @RequestMapping({"/","/home"})
    public String showHomePage() {
        return VIEW_HOME_PAGE;
    }

    @RequestMapping("/new")
    public String newAccount() {
        return VIEW_NEW_ACCOUNT_PAGE;
    }

    @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
    public String saveAccount(Model model, HttpServletRequest request) {

        String acNo = request.getParameter("accountNo");
        String customerName = request.getParameter("accountHolderName");
        String balance = request.getParameter("balance");


        Account account = new Account();
        account.setAccountHolderName(customerName);
        account.setAccountNo(Integer.parseInt(acNo));
        account.setBalance(Integer.parseInt(balance));

        model.addAttribute("account", account);
        return "show_account";
    }

    @RequestMapping("/showAccount")
    public String showAccount() {
        return "show_account";
    }
}
