package java8.common;


import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by luan on 2017/2/23.
 */
public class Apple {
    private Integer weight;
    private String color;

    public Apple(){

    }

    public Apple(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }
    public Apple(Integer weight, String color,String no) {
        this.weight = weight;
        this.color = color;
    }
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public static Comparator<Apple> comparing(
            Function<Apple,Integer> function){

       return (a,b)->function.apply(a)>=function.apply(b)?1:-1;/* */
    }


}
