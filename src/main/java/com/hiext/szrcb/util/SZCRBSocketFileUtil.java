package com.hiext.szrcb.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.hiext.szrcb.request.SZRCBConstant;

/**
 * 
 * @author angy
 * * @since 2020/10/31
 */
public class SZCRBSocketFileUtil {

    private final static Long SIZE = 102398L;

    public static String getFile(String host, String fileName) {
        String port = SZRCBConstant.getFileport();
        return getFile(host, port, fileName);
    }

    public static String getFile(String host, String port, String fileName) {
        StringBuffer buffer = new StringBuffer();
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); 
        try {
            // 1.获取文件size
            String getSize = "SIZE " + fileName;
            String data = dataSig(getSize);
            //System.out.println(data);
            socket = new Socket(host, Integer.valueOf(SZRCBConstant.getFileport()));
            outputStream = socket.getOutputStream();// 获取一个输出流，向服务端发送信息
            inputStream = socket.getInputStream();// 获取一个输入流，接收服务端的信息
            socket.setSoTimeout(1000 * 1000);

            outputStream.write(data.getBytes());
            outputStream.flush();
            int avLength = inputStream.available();
            while (avLength <= 10) {
                Thread.sleep(15);
                avLength = inputStream.available();
            }
            byte[] tempByte = new byte[10];
            inputStream.read(tempByte);
            String fileSizes = new String(tempByte);
            byte[] size = new byte[Integer.valueOf(fileSizes)];
            inputStream.read(size);
            String tempSend = new String(size);
            fileSizes = tempSend.substring(5);
            Long fileLength = 0L;
            if (fileSizes != null && !"".equals(fileSizes)) {
                fileLength = Long.valueOf(fileSizes);
            }
            if (fileLength == 0)
                return null;
            long getTime = 1L;
            if (fileLength > SIZE) {
                getTime = (fileLength / SIZE) + 1;
            }
            for (long i = 1; i <= getTime; i++) {
                long start = (i - 1) * SIZE;
                long end = i * SIZE;
                if (getTime == 1L) {
                    end = fileLength;
                } else {
                    if (getTime > 1 && i == getTime) {
                        end = fileLength;
                    } else {
                        end = i * SIZE;
                    }
                }
                long tempDataSize = end - start;
                String getFileData = "GET " + fileName + " " + start + " " + tempDataSize;
                String re = dataSig(getFileData);
                outputStream.write(re.getBytes());
                outputStream.flush();
                int curt = inputStream.available();
                while (curt <= 20) {
                    Thread.sleep(15);
                    curt = inputStream.available();
                }

                byte[] reForHeadByte = new byte[10];
                inputStream.read(reForHeadByte);
                String reHeadSizeString = new String(reForHeadByte);
                byte[] realSizeByte = new byte[Integer.valueOf(reHeadSizeString)];
                inputStream.read(realSizeByte);
                String realSizeString = new String(realSizeByte);
                realSizeString = realSizeString.substring(5);
                int curDataLength = inputStream.available();
                while (curDataLength <= 12) {
                    Thread.sleep(15);
                    curDataLength = inputStream.available();
                    // System.out.println(curDataLength);
                }
                byte[] tempByte2 = new byte[10];
                inputStream.read(tempByte2);
                int curDatalengt = 0;
                String te = new String(tempByte2);
                curDatalengt = Integer.valueOf(te);
                // System.out.println(curDatalengt);
                byte[] tempByte3 = new byte[2];
                inputStream.read(tempByte3);
                int nowDatalength = inputStream.available();
                while (nowDatalength < curDatalengt - 2) {
                    Thread.sleep(15);
                    nowDatalength = inputStream.available();
                    // System.out.println(nowDatalength);
                }
                byte[] dataTempByte = new byte[curDatalengt - 2];
                inputStream.read(dataTempByte);
                byteArrayOutputStream.write(dataTempByte);
            }
            String close = "QUIT";
            String cl = dataSig(close);
            outputStream.write(cl.getBytes());
            outputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            buffer.append(new String(byteArray, "GBK"));
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();// 关闭输出流
            }
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
            byteArrayOutputStream.close();
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
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
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return buffer.toString();
    }

    private static String dataSig(String xml) {
        String pack = "00" + xml;
        byte[] tempByte = null;
        tempByte = pack.getBytes();
        int length = tempByte.length;
        String data = String.format("%10d", length).replace(" ", "0") + pack;
        //System.out.println(data);
        return data;
    }

    public static void main(String[] args) {
        String file = getFile("127.0.0.1", "2020110420653120.query");
        if (file != null) {
            System.out.println(file);
        }
    }

}
