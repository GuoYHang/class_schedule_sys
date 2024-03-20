package com.keydousguo.www.controller.sys;

import com.keydousguo.www.domain.AjaxResult;
import com.keydousguo.www.domain.model.LoginBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping(value = "/login")
    public AjaxResult login() {
        AjaxResult ajax = AjaxResult.success();
        System.out.println("success");
        return ajax;
    }

}
