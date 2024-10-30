package com.rock.dubbo.user.service.impl;

import com.rock.dubbo.api.product.ProductRemoteService;
import com.rock.dubbo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Reference(interfaceClass = ProductRemoteService.class, version = "1.0.0")
    private ProductRemoteService productRemoteService;

    public String helloWorld() {
        //实现
        return productRemoteService.helloWorld();
    }

}
