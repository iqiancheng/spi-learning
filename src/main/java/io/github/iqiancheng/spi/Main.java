package io.github.iqiancheng.spi;

import lombok.extern.slf4j.Slf4j;

import java.util.ServiceLoader;


/**
 * @author <a href="mailto:i@qiancheng.me">qiancheng</a>
 */
@Slf4j
public class Main {

    /**
     * start
     * @param args
     */
    public static void main(String[] args) {
        log.info("startup");
        ServiceLoader<HelloService> loaders = ServiceLoader.load(HelloService.class);
        for (HelloService service : loaders) {
            service.say("spi");
        }
    }
}
