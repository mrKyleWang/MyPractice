package top.kylewang.demo.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Kyle.Wang
 * 2018/2/4 0004 10:29
 */
@Service
public class DemoService {

    @Async
    public void a() {
        while (true) {
            System.out.println("a");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Async
    public void b() {
        while (true) {
            System.out.println("b");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
