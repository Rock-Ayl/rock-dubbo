package com.rock.dubbo.user.service.impl;

import com.rock.dubbo.api.product.ProductRemoteService;
import com.rock.dubbo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @DubboReference
    private ProductRemoteService productRemoteService;

    public String getProductData() {
        //实现
        return productRemoteService.helloWorld();
    }

}
