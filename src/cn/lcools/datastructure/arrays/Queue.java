package cn.lcools.datastructure.arrays;

/**
 * Created by liushuai3 on 2019/6/19.
 */
public interface Queue<E> {
    void enqueue(E e);
    E dequeue();
    E getFront();
    int getSize();
    boolean isEmpty();
}
