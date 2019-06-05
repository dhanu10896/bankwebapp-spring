package app.dhananjay.springbankapp.controllers;

import app.dhananjay.springbankapp.model.Account;
import app.dhananjay.springbankapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


import static app.dhananjay.springbankapp.config.ViewNameConstants.*;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, ste);
    }

    @RequestMapping({"/", "/home"})
    public String showHomePage() {
        return VIEW_HOME_PAGE;
    }

    @RequestMapping("/new")
    public String newAccount(Model model) {
        model.addAttribute("account", new Account());
        return VIEW_ACCOUNT_FORM_PAGE;
    }


    //using hibernate validator.
    @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
    public String saveAccount(@Valid @ModelAttribute("account") Account account,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return VIEW_ACCOUNT_FORM_PAGE;
        } else {
            accountService.saveAccount(account);
            return "redirect:/list";

        }
    }

//    //using databinding
//    @RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
//    public String saveAccount(Model model, Account account) {
//        model.addAttribute("account", account);
//        return "show_account";
//    }

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

    @GetMapping("/list")
    public String listAccounts(Model model) {
        model.addAttribute("accounts",accountService.getAccounts());
        return "list_accounts";
    }

    @GetMapping("/edit")
    public String updateAccount(@RequestParam("accountNo") Integer accountNo, Model model) {
        Account account = accountService.getAccount(accountNo);
        model.addAttribute("account", account);
        return VIEW_ACCOUNT_FORM_PAGE;
    }

    @GetMapping("/delete")
    public String deleteAccount(@RequestParam("accountNo") Integer accountNo, Model model) {
        accountService.deleteAccount(accountNo);
        return "redirect:/list";
    }
}
