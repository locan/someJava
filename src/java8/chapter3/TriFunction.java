package java8.chapter3;

/**
 * Created by luan on 2017/2/24.
 */
@FunctionalInterface
public interface TriFunction<T,U,V,R> {
    public R apply(T t,U u,V v);
}
