package java8.common;

/**
 * Created by luan on 2017/2/23.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {

        return apple.getWeight()>150;
    }
}
