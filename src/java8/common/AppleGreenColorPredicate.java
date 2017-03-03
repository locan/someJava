package java8.common;

/**
 * Created by luan on 2017/2/23.
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
