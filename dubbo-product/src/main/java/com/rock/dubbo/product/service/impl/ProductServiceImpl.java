package com.rock.dubbo.product.service.impl;

import com.rock.dubbo.api.user.UserRemoteService;
import com.rock.dubbo.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Reference(interfaceClass = UserRemoteService.class, version = "1.0.0")
    private UserRemoteService userRemoteService;

    public String helloWorld() {
        //实现
        return userRemoteService.helloWorld();
    }

}
