package cn.lcools.datastructure.arrays;

/**
 * Created by liushuai3 on 2019/6/19.
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
