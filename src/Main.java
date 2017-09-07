import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        try {
            File file = new File("demo/1.txt");
            if(!file.exists())
                file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            String str = "水房";
            String utf8 = new String(str.getBytes("UTF-8"));

            String gbk = new String(utf8.getBytes("GBK"));
            byte[] buf = new byte[20*1024];
            byte[] bs = str.getBytes("GBK");
            fos.write(bs);
            System.out.println(new String(gbk));
          /*  System.out.println("--------------测试1------------------");
            String str2 = new String("A测试中国结".getBytes("UTF-8"), "UTF-8");
            System.out.println(str2 + "---"
                    + new String(str2.getBytes("UTF-8"), "UTF-8") + "----="
                    //
                    + new String(str2.getBytes("GBK"), "GBK"));//-----标记[1]

            str2 = new String("B测试中国结".getBytes("GBK"), "GBK");
            System.out.println(str2 + "---"
                    //
                    + new String(str2.getBytes("UTF-8"), "UTF-8")//----标记[2]
                    + "----="+ new String(str2.getBytes("GBK"), "GBK"));
            System.out.println("--------------------------------");
            str2 = new String("C测试中国结".getBytes("GBK"), "GBK");
            System.out.println(new String(new String(str2.getBytes("UTF-8"),
                    "ISO-8859-1").getBytes("ISO-8859-1"), "UTF-8"));
            str2 = new String("D测试中国结".getBytes("UTF-8"), "UTF-8");
            System.out.println(new String(new String(str2.getBytes("GBK"),
                    "ISO-8859-1").getBytes("ISO-8859-1"), "GBK"));*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}