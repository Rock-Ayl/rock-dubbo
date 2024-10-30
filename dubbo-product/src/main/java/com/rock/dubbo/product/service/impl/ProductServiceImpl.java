package com.rock.dubbo.product.service.impl;

import com.rock.dubbo.api.user.UserRemoteService;
import com.rock.dubbo.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @DubboReference
    private UserRemoteService userRemoteService;

    public String getUserData() {
        //实现
        return userRemoteService.helloWorld();
    }

}
