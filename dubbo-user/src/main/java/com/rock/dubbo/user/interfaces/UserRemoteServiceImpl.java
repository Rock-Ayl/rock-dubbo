package com.rock.dubbo.user.interfaces;

import com.rock.dubbo.api.user.UserRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Slf4j
@Service(version = "1.0.0", timeout = 6000)
@Component
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