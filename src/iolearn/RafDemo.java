package iolearn;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by locan on 17/5/28.
 */
public class RafDemo {

    public static void main(String[] args) {
        File demo = new File("demo");
        if(!demo.exists())
            demo.mkdir();
        File file = new File(demo,"raf.dat");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(file,"rw");

            System.out.println(raf.getFilePointer());
            raf.write('A');
            System.out.println(raf.getFilePointer());
            raf.write('B');
            System.out.println(raf.getFilePointer());

            int i = 0x7fffffff;
            raf.write(i>>>24);
            raf.write(i>>>16);
            raf.write(i>>>8);
            System.out.println(raf.getFilePointer());
            String s = "中";
            byte[] bytes = s.getBytes("utf-8");
            System.out.println(raf.length());
            raf.seek(0);

            byte[] buf = new byte[(int)raf.length()];
            raf.read(buf);
            System.out.println(Arrays.toString(buf));

            for(byte b:buf){
                System.out.println(Integer.toHexString(b&0xff));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


