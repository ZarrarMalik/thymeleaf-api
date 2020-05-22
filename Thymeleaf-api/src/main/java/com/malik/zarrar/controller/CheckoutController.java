package com.malik.zarrar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import commands.CheckoutCommand;

@Controller
public class CheckoutController {

    private CheckoutCommand CheckoutCommand;
    
    
    @Autowired
    public void setCheckoutCommand(CheckoutCommand checkoutCommand) {
        CheckoutCommand = checkoutCommand;
    }

    @RequestMapping("/checkout")
    public String checkoutForm(Model model){
        model.addAttribute("checkoutCommand", new CheckoutCommand());
        return "checkoutform";
    }

    @RequestMapping(value = "/docheckout", method = RequestMethod.POST)
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";

    }

}