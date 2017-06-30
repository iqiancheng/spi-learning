package io.github.iqiancheng.spi;

import lombok.extern.slf4j.Slf4j;

import java.util.ServiceLoader;


/**
 * @author <a href="mailto:i@qiancheng.me">yan.peng</a>
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("startup");
        ServiceLoader<HelloService> loaders = ServiceLoader.load(HelloService.class);
        for (HelloService loader : loaders) {
            loader.say("spi");
        }
    }
}
