package java8.chapter5;

import java8.common.Dish;
import java8.common.PrintUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by luan on 2017/3/3.
 */
public class UseStream {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Dish.Type.MEAT),
                new Dish("beef",false,700,Dish.Type.MEAT),
                new Dish("chicken",false,400,Dish.Type.MEAT),
                new Dish("french fries",true,530,Dish.Type.OTHER),
                new Dish("rice",true,350,Dish.Type.OTHER),
                new Dish("season fruit",true,120,Dish.Type.OTHER),
                new Dish("pizza",true,550,Dish.Type.OTHER),
                new Dish("prawns",false,300,Dish.Type.FISH),
                new Dish("salmon",false,450,Dish.Type.FISH)
        );
        List<Dish> vegetarianDishes = menu.stream().filter(d->d.isVegetarian()).collect(Collectors.toList());
        PrintUtil.print(vegetarianDishes);
        List<Dish> vegetarianDishes2 = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
        PrintUtil.print(vegetarianDishes2);

        List<Integer> dishNameLenghts = menu.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
        PrintUtil.print(dishNameLenghts);

        String[] arrayOfWords = {"Goodbye","World"};
        List<String> words = Arrays.asList(arrayOfWords);
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        PrintUtil.print(
                words.stream().map(w->w.split(""))
                        .map(Arrays::stream)
                        .collect(Collectors.toList())
        );
        PrintUtil.print(
                words.stream().map(w->w.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .collect(Collectors.toList())
        );
        List<Integer> nums = Arrays.asList(1,2,3,4);
        PrintUtil.print(
                nums.stream().map(n->n*n).collect(Collectors.toList())
        );

        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);
        List<int[]> pairs = numbers1.stream().flatMap(i->numbers2.stream()
                .map(j->new int[]{i,j})).collect(Collectors.toList());
        List<int[]> pairs2 = numbers1.stream()
                .flatMap(
                         i->numbers2.stream()
                        .filter(j->(i+j)%3==0)
                        .map(j->new int[]{i,j})
                )
                .collect(Collectors.toList());
        PrintUtil.print(pairs2);


        boolean isHealth = menu.stream().allMatch(d->d.getCalories()<1000);
        PrintUtil.print(isHealth);
        boolean isHealth2 = menu.stream().noneMatch(d->d.getCalories()>=1000);
        PrintUtil.print(isHealth2);

        Optional<Dish> dishOptional = menu.stream().filter(Dish::isVegetarian).findAny();
        menu.stream().filter(Dish::isVegetarian)
                .findAny().ifPresent(d-> PrintUtil.print(d.getName()));

        List<Integer> someNumbers = Arrays.asList(1,2,3,4,5);
        someNumbers.stream().map(x->x*x).filter(x->x%3==0).findFirst().ifPresent(n->PrintUtil.print(n));


        PrintUtil.print(
                someNumbers.stream().reduce(0,(a,b)->a+b)
        );
        PrintUtil.print(
                someNumbers.stream().reduce(0,Integer::sum)
        );
        someNumbers.stream().reduce(Integer::sum).ifPresent(sum->PrintUtil.print(sum));
        someNumbers.stream().reduce(Integer::max).ifPresent(max->PrintUtil.print(max));

        menu.stream().map(d->1).reduce((a,b)->a+b).ifPresent(sum->PrintUtil.print(sum));
        PrintUtil.print(menu.stream().count());

    }
}
