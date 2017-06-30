package io.github.iqiancheng.spi.service;

import io.github.iqiancheng.spi.HelloService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="mailto:i@qiancheng.me">qiancheng</a>
 */
@Slf4j
public class HelloServiceImpl implements HelloService{

    public String say(String msg) {
        log.debug("HelloServiceImpl.say( {} ) enter..",msg);
        return msg;
    }
}
