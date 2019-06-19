package cn.lcools.datastructure.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushuai3 on 2019/6/19.
 * 动态数组栈
 */
public class ArrayStack<E> implements Stack<E>{
    private List<E> list;
    private int size;

    public ArrayStack(){
        list = new ArrayList();
    }

    public int getSize() {
        return size;
    }

    @Override
    public void push(E e){
        list.add(size,e);
        size++;
    }

    @Override
    public E pop(){
        E e = list.remove(size-1);
        size --;
        return e;
    }

    @Override
    public E peek(){
        return list.get(size-1);
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("ArrayStack size = %d :\n",size));
        res.append("[");
        for (int i =0 ; i<size ; i++) {
            res.append(list.get(i));
            if (i != size-1){
                res.append(",");
            }
        }
        res.append("]top");
        return res.toString();
    }

}
