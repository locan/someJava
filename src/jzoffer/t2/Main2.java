package jzoffer.t2;

/**
 * Created by locan on 17/4/11.
 * 替换空格
 */
public class Main2 {
    public static void main(String... args){

    }

    public String replaceSpace(StringBuffer str){
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<str.length();i++){
            if(" ".equals(str.charAt(i))){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }


        return sb.toString();
    }
}
