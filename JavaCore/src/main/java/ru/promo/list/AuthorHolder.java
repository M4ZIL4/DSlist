package ru.promo.list;

@FunctionalInterface
public interface AuthorHolder<T> {
    T add();
}
