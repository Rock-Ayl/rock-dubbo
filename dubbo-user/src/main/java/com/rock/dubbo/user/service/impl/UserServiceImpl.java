package com.rock.dubbo.user.service.impl;

import com.rock.dubbo.api.product.ProductRemoteService;
import com.rock.dubbo.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    /**
     * 服务注入,并指定 负载均衡 为 轮询
     */
    @DubboReference(loadbalance = "roundrobin")
    private ProductRemoteService productRemoteService;

    public String getProductData() {
        //实现
        return productRemoteService.helloWorld();
    }

}
