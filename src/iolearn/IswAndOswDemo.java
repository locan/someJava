package iolearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符流大多数操作的都是文本文件
 * Created by locan on 17/5/29.
 */
public class IswAndOswDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("demo/out.dat");
        InputStreamReader isr = new InputStreamReader(in,"utf-8");

        /*
        int c;
        while((c = isr.read())!=-1){
            System.out.println((char)c);
        }

        */
        char[] buffer = new char[8*1024];
        int c;
        while((c=isr.read(buffer,0,buffer.length))!=-1){

        }
    }
}
