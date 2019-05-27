package com.figurine.controller;


import com.figurine.entity.request.InfoSubmitRequestModel;
import com.figurine.entity.request.LoginRequestModel;
import com.figurine.entity.request.RegisterRequestModel;
import com.figurine.entity.result.Result;
import com.figurine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/user/register")
    public Result<String> register(@RequestBody RegisterRequestModel requestModel) {
        return userService.register(requestModel);
    }


    /**
     * 登陆
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/user/login")
    public Result<String> login(@RequestBody LoginRequestModel requestModel) {
        return userService.login(requestModel);
    }


    /**
     * 资料提交
     *
     * @param requestModel
     * @return
     */
    @PostMapping("/v1/vsm/user/info/submit")
    public Result<String> infoSubmit(@RequestBody InfoSubmitRequestModel requestModel) {
        return userService.infoSubmit(requestModel);
    }


}
