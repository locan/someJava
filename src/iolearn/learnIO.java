package iolearn;

import java.io.UnsupportedEncodingException;

/**
 * Created by locan on 17/5/27.
 */
public class learnIO {
    public static void main(String[] args) {


        try {
            String s = "我爱学习ABC";
            /**
             * 此项目是utf-8默认的编码格式
             */
            byte[] b1 = s.getBytes();

            for(byte b:b1){
                System.out.print(Integer.toHexString(b & 0xff)+" ");
            }
            System.out.println();
            /**
             * 获取gbk的编码
             */
            byte[] b2 = s.getBytes("gbk");
            for (byte b:b2){
                System.out.print(Integer.toHexString(b& 0xff)+ " ");
            }
            /**
             * 获取utf-16be的编码
             */
            System.out.println();
            byte[] b3 = s.getBytes("utf-16be");
            for (byte b:b3){
                System.out.print(Integer.toHexString(b& 0xff)+ " ");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
