package top.kylewang.demo.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kyle.Wang
 * 2018/2/4 0004 10:31
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        DemoService demoService = applicationContext.getBean(DemoService.class);
        demoService.a();
        demoService.b();

    }
}
