package com.rock.dubbo.product.interfaces;

import com.rock.dubbo.api.product.ProductRemoteService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class ProductRemoteServiceImpl implements ProductRemoteService {

    /**
     * 实现
     *
     * @return
     */
    public String helloWorld() {
        return "你获得了产品数据!";
    }

}
