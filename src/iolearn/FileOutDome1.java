package iolearn;

import java.io.*;

/**
 * Created by locan on 17/5/29.
 */
public class FileOutDome1 {



    public static void main(String[] args) {
        try {
            // 如果该文件不存在，则创建，如果存在，删除后创建
            FileOutputStream out = new FileOutputStream("demo/out.dat");

            out.write('A');
            out.write('B');
            int a =10;
            out.write(a>>>24);
            out.write( a>>>16);
            out.write(a>>>8);
            out.write(a);

            byte[] gbk = "中国".getBytes("gbk");
            out.write(gbk);
            out.close();
            IOUtil.printHexByBtyeArray("demo/out.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void copyFile(File src,File dest)throws IOException{
        if(!src.exists()){
            throw new IllegalArgumentException("文件不存在");
        }
        if(!src.isFile()){
            throw new IllegalArgumentException("不是文件");
        }

        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dest);
        byte[] buf = new byte[8*1024];
        int b;
        while((b=in.read(buf,0,buf.length))!=-1){
            out.write(buf,0,b);
            out.flush();
        }


    }
}
