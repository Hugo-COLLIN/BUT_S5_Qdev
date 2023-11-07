package org.iut.func.either;

@FunctionalInterface
public interface CheckedFunction<T, R> {
    public R apply(T t) throws Exception;

}