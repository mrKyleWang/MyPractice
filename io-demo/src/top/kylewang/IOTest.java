package top.kylewang;

import org.junit.Test;
import sun.security.krb5.internal.Ticket;
import top.kylewang.bio.BioClient;
import top.kylewang.bio.BioServer;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Kyle.Wang
 * 2018/1/25 0025 13:10
 */
@SuppressWarnings("ALL")
public class IOTest {

    @Test
    public void bioTest() throws InterruptedException, IOException {
        //运行服务器
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    BioServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //避免客户端先于服务器启动前执行代码
        Thread.sleep(100);
        //运行客户端
        Random random = new Random(System.currentTimeMillis());
        //返回一个线程池
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    BioClient.send();
                }
            }).start();
        }
    }
}