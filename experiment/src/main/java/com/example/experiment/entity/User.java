package com.example.experiment.entity;
import com.baomidou.mybatisplus.annotation.TableName;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.io.Serializable;

@Data //@Data 注解自动生成 getter/setter
public class User {
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String name;
    @NotBlank(message = "邮件不能为空")
    private String email;
    @Digits(integer = 3,fraction = 0,message = "年龄必须为整数")
    private int age;

}