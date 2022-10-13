package ru.promo.list;

import java.util.Iterator;
import java.util.List;

public interface DescendingIterator<E> {
    Iterator<E> descendingIterator();

    void addAll(List anotherExtList);

    void addAll(int index, List anotherExtList);
}
