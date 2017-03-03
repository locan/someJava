package java8.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luan on 2017/2/23.
 */
public class Filter {

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e:list){
            if (p.test(e)){
                result.add(e);
            }
        }
        return result;
    }
    public static void main(String... args){
        /*
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155,"green"),
                new Apple(120,"red"));
        List<Apple> result= filter(inventory,(Apple apple) -> "red".equals(apple.getColor()));
        PrintUtil.print(result);

        Integer[] nums = new Integer[100];
        for(int i=0;i<100;i++){
            nums[i] = i;
        }
        List<Integer> numbers = Arrays.asList(nums);
        List<Integer> numresult = filter(numbers,(Integer i) -> i%2==0);
        PrintUtil.print(numresult);
        */
        Thread t = new Thread(()-> {
            Integer i = 1;
            while(i <100){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i = i+10;
            }

        });
        t.start();
    }
}
