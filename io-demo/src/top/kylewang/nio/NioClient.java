package top.kylewang.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Kyle.Wang
 * 2018/1/25 0025 11:42
 */
public class NioClient {

    private static String DEFAULT_SERVER_IP = "127.0.0.1";
    private static int DEFAULT_SERVER_PORT = 12345;

    public static void send() {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {



            socket = new Socket(DEFAULT_SERVER_IP, DEFAULT_SERVER_PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println(Thread.currentThread().getName() + ":client发出请求," + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date(System.currentTimeMillis())));
            out.println("我是client:" + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + ":client收到响应,响应内容:" + in.readLine());
            System.out.println(Thread.currentThread().getName() + ":client后续业务," + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date(System.currentTimeMillis())));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
