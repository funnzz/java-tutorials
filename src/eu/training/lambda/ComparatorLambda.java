package eu.training.lambda;


import java.util.function.Function;

@FunctionalInterface
public interface ComparatorLambda<T> {

    public int compare(T t1, T t2);

    public default ComparatorLambda<T> thenComparing(ComparatorLambda<T> cmp){
        return (p1,p2)-> compare(p1,p2) == 0 ? cmp.compare(p1,p2):compare(p1,p2);
    }

    public static <U> ComparatorLambda<U> comparing(Function<U, Comparable> f){
        return (p1,p2) -> f.apply(p1).compareTo(f.apply(p2));
    }
}
