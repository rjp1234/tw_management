package cn.deepclue.eyes.web.controller;

import cn.deepclue.eyes.annotation.CurrentAccount;
import cn.deepclue.eyes.annotation.LoginRequired;
import cn.deepclue.eyes.domain.po.cas.User;
import cn.deepclue.eyes.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.deepclue.eyes.domain.po.management.*;

@RestController
@RequestMapping("/management")
//@LoginRequired
public class ManagementController {

    @Autowired
    ManagementService managementService;

    @GetMapping()
    public String hello() {
        return "Hello";
    }

//    @GetMapping(path = "/user")
//    public User getUser(@CurrentAccount AccountBO currentAccount, @RequestParam(required = true) String id) {
//        return managementService.getCasUserById(id);
//    }
}
