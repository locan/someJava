/**
 * Created by luan on 2017/2/24.
 */
package java8.chapter3;

import java8.common.Apple;
import java8.common.PrintUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ProcessFile {


    public static String processFile(BufferReaderProcessor p) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("resource/1.txt"))){
            return p.process(br);
        }

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<T>();
        for(T e:list){
            if(predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }

    public static <T> void forEach(List<T> list ,Consumer<T> consumer){
        for (T t:list){
            consumer.accept(t);
        }
    }

    public static <T,R> List<R> map(List<T> list,Function<T,R> function){
        List<R> result = new ArrayList<R>();
        for(T t :list){
            result.add(function.apply(t));
        }
        return result;
    }

    public static void main(String... args) throws IOException {
            String oneLine = processFile((BufferedReader br) -> br.readLine());
            PrintUtil.print(oneLine);
            String twoLine = processFile((BufferedReader br) -> br.readLine()+" "+br.readLine());
            PrintUtil.print(twoLine);

            List<String> allList = new ArrayList<>();
            // 筛选出allList中不空的字符串
            List<String> newList = filter(Arrays.asList("1222","","---","2e","4111111111111"),(String str) -> !str.isEmpty());
            PrintUtil.print(newList);

            forEach(newList,(String str) -> PrintUtil.print(str));


            List<Integer> lengthList = map(newList,(String str) -> str.length());
            PrintUtil.print(lengthList);

            Supplier<Apple> s1 = Apple::new;
            Apple apple1 = s1.get();
            TriFunction<Integer,String,String,Apple> tri = Apple::new;
            Apple apple2 = tri.apply(1,"","");


    }
}
