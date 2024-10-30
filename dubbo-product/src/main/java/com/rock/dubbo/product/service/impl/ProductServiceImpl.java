package com.rock.dubbo.product.service.impl;

import com.rock.dubbo.product.interfaces.ProductServiceAPI;
import com.rock.dubbo.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Reference(interfaceClass = ProductServiceAPI.class, version = "1.0.0")
    private ProductServiceAPI productServiceAPI;

    public String helloWorld() {
        //实现
        return productServiceAPI.helloWorld();
    }

}
