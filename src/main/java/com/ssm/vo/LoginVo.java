package com.ssm.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginVo {
    private String token;
    private String result;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "token='" + token + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
