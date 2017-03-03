package java8.chapter2;

import java8.common.Apple;
import java8.common.AppleFormatter;

import java.util.List;

/**
 * Created by luan on 2017/2/23.
 */
public class Chapter2_1 {



    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for (Apple apple:inventory){
            String output = formatter.accpt(apple);
            System.out.println(output);
        }
    }
}
