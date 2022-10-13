package ru.promo.list;

import org.testng.annotations.Test;

public class DSListTest {

    @Test
    public void addFirst() {
        DSList list = new DSList();
        for (int i = 0; i < 5; i++) {
            list.addFirst(i);
        }
        list.printList();
    }

    @Test
    public void addLast() {
        DSList list = new DSList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        list.addLast(8);
        list.printList();
    }

    @Test
    public void add() {
        DSList list = new DSList();
        for (int i = 0; i < 5; i++) {
            list.add(i);
            list.printList();
        }
    }

    @Test
    public void addIndex() {
        DSList list = new DSList();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        list.printList();
        list.add(8, "Test");
        System.out.println();
        list.printList();
    }

    @Test
    public void addAll() {
        DSList list = new DSList();
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        DSList list1 = new DSList();
        for (int i = 5; i < 15; i++) {
            list1.add(i);
        }
        list1.printList();
        System.out.println();
        list1.addAll(list);
        System.out.println();
        list1.printList();
    }

    @Test
    public void addAll1() {

        DSList list = new DSList();
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        DSList list1 = new DSList();
        for (int i = 5; i < 15; i++) {
            list1.add(i);
        }
        list1.printList();
        System.out.println();
        list1.addAll(3, list);
        list1.printList();
    }

    @Test
    public void addAll2() {

        DSList list = new DSList();
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        DSList list1 = new DSList();
        for (int i = 23; i < 29; i++) {
            list1.add(i);
        }
        list1.printList();
        System.out.println();
        list1.addAll(5, list);
        list1.printList();
    }

    @Test
    public void remove() {
        DSList list = new DSList();
        for (int i = 0; i < 23; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        list.remove(8);
        System.out.println();
        list.printList();
    }

    @Test
    public void removeFirst() {
        DSList list = new DSList();
        for (int i = 0; i < 16; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        list.removeFirst();
        System.out.println();
        list.printList();
    }

    @Test
    public void removeLast() {
        DSList list = new DSList();
        for (int i = 0; i < 19; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        list.removeLast();
        System.out.println();
        list.printList();
    }

    @Test
    public void clear() {
        DSList list = new DSList();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        list.printList();
        System.out.println();
        list.clear();
        System.out.println();
        list.printList();
    }

    @Test
    public void toArray() {
        DSList list = new DSList();
        for (int i = 0; i < 18; i++) {
            list.add(i);
        }
        Object[] array = list.toArray();
        for (Object object : array) {
            System.out.println(object);
        }
    }

    @Test
    public void set() {
        DSList list = new DSList();
        for (int i = 0; i < 21; i++) {
            list.add(i);
        }
        list.printList();
        list.set(8, "Test");
        list.printList();
    }
}
