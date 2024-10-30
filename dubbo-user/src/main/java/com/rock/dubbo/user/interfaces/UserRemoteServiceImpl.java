package com.rock.dubbo.user.interfaces;

import com.rock.dubbo.api.user.UserRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@DubboService
public class UserRemoteServiceImpl implements UserRemoteService {

    /**
     * 实现
     *
     * @return
     */
    public String helloWorld() {
        return "你获得了用户数据!";
    }

}