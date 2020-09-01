package cn.hxq.service.client;

import cn.hxq.service.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider",fallback = UserClientFallback.class)//声明一个接口是feign接口
public interface UserClient {

    @GetMapping("user/{id}")
    public User queryUserById(@PathVariable("id")Long id);
}
