package top.kylewang.demo.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Kyle.Wang
 * 2018/2/4 0004 9:51
 */
public class CallableDemo implements Callable<String> {


    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName() + "-结果";
    }

    public static void main(String[] args) throws Exception{
        CallableDemo callableDemo = new CallableDemo();
        FutureTask<String> futureTask = new FutureTask<>(callableDemo);
        Thread thread = new Thread(futureTask, "线程1");
        thread.start();
        String result = futureTask.get();
        System.out.println(result);

    }

}
