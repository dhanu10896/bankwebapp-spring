package app.dhananjay.springbankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = {"/","/index","/index*","/view"})
    public String index() {
        return "test_request_mapping";
    }

    @RequestMapping(value = "/showmyname")
    public String methodWithParams(@RequestParam(value = "myname"
            , defaultValue = "dhananjay", required = false) String myname, Model model) {

        model.addAttribute("myname", myname);
        return "test_request_mapping";
    }

}
