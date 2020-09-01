package cn.hxq.service.service;

import cn.hxq.service.mapper.UserMapper;
import cn.hxq.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
