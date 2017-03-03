package java8.common;

/**
 * Created by luan on 2017/2/23.
 */
public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accpt(Apple apple) {
        String charateristic = apple.getWeight()>150?"heavy":"light";

        return "A " + charateristic +" " + apple.getColor() + " apple";
    }
}
