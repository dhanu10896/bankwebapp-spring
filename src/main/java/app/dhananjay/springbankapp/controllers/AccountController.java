package app.dhananjay.springbankapp.controllers;

import app.dhananjay.springbankapp.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import static app.dhananjay.springbankapp.config.ViewNameConstants.*;

@Controller
public class AccountController {

    @RequestMapping({"/", "/home"})
    public String showHomePage() {
        return VIEW_HOME_PAGE;
    }

    @RequestMapping("/new")
    public String newAccount(Model model) {
        model.addAttribute("account", new Account());
        return VIEW_NEW_ACCOUNT_PAGE;
    }

    //using databinding
    @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
    public String saveAccount(Model model, Account account) {
        model.addAttribute("account", account);
        return "show_account";
    }


    //2.using ReuqestParam
//    @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
//    public String saveAccount(Model model, //
//                              @RequestParam("accountNo") String acNo,//
//                              @RequestParam("accountHolderName") String customerName,//
//                              @RequestParam("balance") String balance){
//
//        Account account = new Account();
//        account.setAccountHolderName(customerName);
//        account.setAccountNo(Integer.parseInt(acNo));
//        account.setBalance(Integer.parseInt(balance));
//
//        model.addAttribute("account", account);
//        return "show_account";
//    }

    //    3.using request.getParameter
//      @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
//         public String saveAccount(Model model, HttpServletRequest request) {
//
//             String acNo = request.getParameter("accountNo");
//             String customerName = request.getParameter("accountHolderName");
//             String balance = request.getParameter("balance");
//
//
//             Account account = new Account();
//             account.setAccountHolderName(customerName);
//             account.setAccountNo(Integer.parseInt(acNo));
//             account.setBalance(Integer.parseInt(balance));
//
//             model.addAttribute("account", account);
//             return "show_account";
//         }
//
    @RequestMapping("/showAccount")
    public String showAccount() {
        return "show_account";
    }
}
