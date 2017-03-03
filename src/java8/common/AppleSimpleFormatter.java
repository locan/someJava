package java8.common;

/**
 * Created by luan on 2017/2/23.
 */
public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accpt(Apple apple) {
        return "An apple of "+apple.getWeight()+"g";
    }
}
