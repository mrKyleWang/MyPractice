package top.kylewang;

import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kyle.Wang
 * 2018/1/25 0025 13:10
 */
public class ServerHandler implements Runnable {

    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            String accept;
            while (true) {
                //通过BufferedReader读取一行
                //如果已经读到输入流尾部，返回null,退出循环
                if ((accept = in.readLine()) == null) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ":server收到请求,请求内容:" + accept);
                //模拟本地io过程花费时间
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ":server返回响应"+new SimpleDateFormat("HH:mm:ss:SSS").format(new Date(System.currentTimeMillis())));
                out.println("欢迎您的访问!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //一些必要的清理工作
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                in = null;
            }
            if (out != null) {
                out.close();
                out = null;
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                socket = null;
            }
        }
    }
}
