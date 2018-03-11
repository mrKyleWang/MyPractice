package top.kylewang.demo.logdemo;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LogDemoApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void logTest() {
//        logger.trace("【trace level】");
//        for (int i = 0; i < 50; i++) {
        logger.debug("【debug level】");
        logger.info("【info level】");
        logger.warn("【warn level】");

//        }
    }

}
