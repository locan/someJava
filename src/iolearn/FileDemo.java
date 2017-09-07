package iolearn;

import java.io.File;
import java.io.IOException;

/**
 * Created by locan on 17/5/27.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./javaio");
        file.mkdir();
        System.out.println(file.exists());
        if(file.isDirectory()){
            System.out.println("direction");
        }else if(file.isFile()){
            System.out.println("file");
        }

        File file2 = new File("./javaio/1.txt");
        if(!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            file2.delete();
        }

    }
}
