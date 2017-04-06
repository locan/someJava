package designpattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by locan on 17/3/31.
 */
public class ImputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("resource/test.txt")));
            while ((c = in.read())>0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
