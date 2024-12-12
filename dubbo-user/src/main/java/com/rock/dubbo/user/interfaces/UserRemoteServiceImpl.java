package com.rock.dubbo.user.interfaces;

import com.rock.dubbo.api.user.UserRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
/**
 * 该注解,用于指定dubbo服务实现
 * 负载均衡 设置 轮询(roundrobin)
 * 设置超时时间=3秒
 * 设置服务分组,不同分组无法调用
 */
@DubboService(loadbalance = "roundrobin", timeout = 3000, group = "groupA")
/**
 * 该注解,用于自动刷新 {@link Value} 的属性值.
 * 如果nacos配置中心重新发布,会自动刷新
 */
@RefreshScope
public class UserRemoteServiceImpl implements UserRemoteService {

    /**
     * 用来测试 nacos 作为配置中心,如果开启,一定要有对应的配置中心-发布配置
     * 注意,配置的dataId,要与 bootstrap.properties 中的 {spring.application.name} 保持一致
     */
    //@Value(value = "${nacos.config.testConfigCenter}")
    private String testConfigCenter;

    /**
     * 实现
     *
     * @return
     */
    public String helloWorld() {
        return "你获得了用户数据!";
    }

}