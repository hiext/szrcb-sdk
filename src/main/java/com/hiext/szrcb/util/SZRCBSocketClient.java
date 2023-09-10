package com.hiext.szrcb.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author angy
 * @date 2020/10/28
 */
public class SZRCBSocketClient {

    public static final String post(String host, int port, String xml) {
        if (xml == null || "".equals(xml))
            return null;
        if (host == null || "".equals(host))
            return null;
        Socket socket = null;
        BufferedReader br = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            String pack = "00" + xml;
            byte[] tempByte = null;
            try {
                tempByte = pack.getBytes("GBK");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            int length = tempByte.length;
            String data = String.format("%10d", length).replace(" ", "0") + pack;
            System.out.println(data);
            socket = new Socket(host, port);
            socket.setSoTimeout(120000);
            outputStream = socket.getOutputStream();// 获取一个输出流，向服务端发送信息
            outputStream.write(data.getBytes("GBK"));
            outputStream.flush();
            inputStream = socket.getInputStream();// 获取一个输入流，接收服务端的信息
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "GBK");// 包装成字符流，提高效率
            br = new BufferedReader(inputStreamReader);// 缓冲区
            String info = "";
            String temp = null;// 临时变量
            while ((temp = br.readLine()) != null) {
                info += temp;
            }
            socket.shutdownOutput();// 关闭输出流
            // 关闭相对应的资源
            br.close();
            outputStream.close();
            inputStream.close();
            socket.close();
            if (!"".equals(info))
                return info.substring(12);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // String data =
        // "<ap>" + "<head>" + "<tr_code>200108</tr_code>" + "<org_code></org_code>" + "<cms_corp_no></cms_corp_no>"
        // + "<user_no></user_no>" + "<serial_no></serial_no>" + "<req_no>546001120161125140228897</req_no>"
        // + "<tr_acdt>20201029</tr_acdt>" + "<tr_time>140228</tr_time>" + "<channel>5</channel>"
        // + "<sign>0</sign>" + "<file_flag>0</file_flag>" + "<reserved></reserved>" + "<session_id></session_id>"
        // + "<local_ip></local_ip>" + "<mac_addr></mac_addr>" + "<internet_ip></internet_ip>" + "</head>"
        // + "<body>" + "<acno>0706678521120100480205</acno>" + "<cur_code>01</cur_code>" + "</body>" + "</ap>";
        // String re = post("120.53.108.30", 10010, data);
        // System.out.print(re);
        String data = "<ap>\r\n" + "  <head>\r\n" + "    <tr_code>590109</tr_code>\r\n" + "    <req_no></req_no>\r\n"
            + "    <tr_acdt>20201030</tr_acdt>\r\n" + "    <tr_time>152726</tr_time>\r\n"
            + "    <channel>5</channel>\r\n" + "    <sign>0</sign>\r\n" + "    <file_flag>0</file_flag>\r\n"
            + "    <reserved></reserved>\r\n" + "  </head>\r\n" + "  <body>\r\n"
            + "    <acno>0706678521120100480205</acno>\r\n" + "    <as_acno></as_acno>\r\n"
            + "    <as_acname>张三</as_acname>\r\n" + "  </body>\r\n" + "</ap>";
        String re = post("120.53.108.30", 10010, data);
        System.out.print(re);
    }

}
