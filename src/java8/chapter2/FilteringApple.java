package java8.chapter2;

import java8.common.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by luan on 2017/2/23.
 */
public class FilteringApple {
    public static void main(String... args){
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155,"green"),
                new Apple(120,"red"));
        List<Apple> heavyApples = filterApples(inventory,new AppleHeavyWeightPredicate());
        PrintUtil.print(heavyApples);
        List<Apple> greenApples = filterApples(inventory,new AppleGreenColorPredicate());
        PrintUtil.print(greenApples);

        // Lambda
        List<Apple> result = filterApples(inventory,(Apple apple) -> "red".equals(apple.getColor()));
        PrintUtil.print(result);
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for (Apple apple:inventory){
            String output = formatter.accpt(apple);
            System.out.println(output);
        }
    }
}
