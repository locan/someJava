package java8.chapter3;

import java8.common.Apple;
import java8.common.PrintUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by luan on 2017/2/24.
 */
public class Result {

    public void testSort(List list){
        //list.sort(Apple::compareTo);
    }

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(100);
        BiFunction<Integer,String,Apple> biFunction = Apple::new;
        List<Apple> list = Arrays.asList(biFunction.apply(random.nextInt(100),"a"),
                biFunction.apply(random.nextInt(100),"b"),
                biFunction.apply(random.nextInt(100),"c"),
                biFunction.apply(random.nextInt(100),"d"));

        PrintUtil.print(list);
        //list.sort(new AppleComparator());

       /* list.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight()>=o2.getWeight()?1:0;
            }
        });*/

      //  list.sort((Apple a,Apple b) -> a.getWeight().compareTo(b.getWeight()));

        //list.sort((a,b)->a.getWeight().compareTo(b.getWeight()));

       // list.sort(Comparator.comparing((a)->a.getWeight()));

//        list.sort(Comparator.comparing(Apple::getWeight));


//        Function<Apple,Integer> function = (a) -> a.getWeight();
        //Comparator<Apple> comparator = (a,b)->a.getWeight()>=b.getWeight()?1:0;
        list.sort(Apple.comparing(Apple::getWeight));
        //  list.sort(Apple::compareTo);
        PrintUtil.print(list);


    }


}
class AppleComparator implements Comparator<Apple>{

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight()>=o2.getWeight()?1:0;
    }
}
