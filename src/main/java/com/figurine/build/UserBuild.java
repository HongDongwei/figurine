package com.figurine.build;

import com.figurine.entity.User;
import com.figurine.entity.response.LoginResponseVO;
import org.springframework.stereotype.Component;

@Component
public class UserBuild {

    /**
     * 构建登录返回信息
     *
     * @param userPass
     * @return
     */
    public LoginResponseVO buildLoginResponse(User userPass) {
        LoginResponseVO loginResponseVO = new LoginResponseVO();
        loginResponseVO.setId(userPass.getId());
        loginResponseVO.setName(userPass.getUsername());
        loginResponseVO.setPhone(userPass.getPhone());
        loginResponseVO.setSign(userPass.getSign());
        loginResponseVO.setImage(userPass.getImage());
        loginResponseVO.setGender(userPass.getGender());
        loginResponseVO.setBalance(userPass.getBalance());
        loginResponseVO.setAddress(userPass.getAddress());
        return loginResponseVO;
    }
}
