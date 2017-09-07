package iolearn;

import java.io.*;

/**
 * Created by locan on 17/5/29.
 */
public class IOUtil {


    public static void printHexByBtyeArray(String fileName) throws IOException {
        FileInputStream in = new FileInputStream(fileName);
        byte[] buf = new byte[20*1024];

        //这样读说明声明的字节数组足够大
        /*
        int bytes = in.read(buf,0,buf.length);

        int j = 0;
        for (int i = 0; i < bytes; i++) {
            if(buf[i]<=0xf){
                System.out.print("0");
            }

            System.out.print(Integer.toHexString(buf[i])+ " ");
            if(j++%10==0){
                System.out.println();
            }
        }
        */
        int bytes = 0;
        int j = 0;
        while((bytes = in.read(buf,0,buf.length))!=-1){
            for(int i=0;i<bytes;i++){
                System.out.print(Integer.toHexString(buf[i]&0xff)+" ");
                if(j++%10==0){
                    System.out.println();
                }

            }
        }
        in.close();
    }


    public static void copyFileByBuffer(File src,File dest) throws IOException{
        if(!src.exists()){
            throw new IllegalArgumentException("文件不存在");
        }
        if(!src.isFile()){
            throw new IllegalArgumentException("不是文件");
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        int c;
        while((c = bis.read())!=-1){
            bos.write(c);
            bos.flush();
        }
        bis.close();
        bos.close();

    }


    public static void main(String[] args) {
        try {
            printHexByBtyeArray("src/iolearn/IOUtil.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
