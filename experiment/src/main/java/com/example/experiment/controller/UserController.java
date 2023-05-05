package com.example.experiment.controller;

import com.example.experiment.common.CommonResponse;
import com.example.experiment.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @PostMapping("/testRequest/{id}")
    public String testRequest(@PathVariable("id") Integer id,@RequestParam String a,@RequestParam Integer b ){
        System.out.println(a+","+b);
        System.out.println(id);

        return "abc";
    }
    @PostMapping("/testRequest1")
    public String testRequest1(@RequestBody User user){
        System.out.println(user);
        return "abc";
    }

    @GetMapping("/testResponse")
    public CommonResponse<Object> testResponse(){
        User user =new User();
        return CommonResponse.createForSuccess(user);
//        return CommonResponse.createForError("登录失败");
    }
}
