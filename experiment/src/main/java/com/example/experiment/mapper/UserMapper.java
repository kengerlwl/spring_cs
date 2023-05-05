package com.example.experiment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.experiment.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
