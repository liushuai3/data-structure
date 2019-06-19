package cn.lcools.datastructure.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushuai3 on 2019/6/19.
 * 动态数组栈
 */
public class ArrayStack<E> implements Stack<E>{

    private List<E> list;

    public ArrayStack(){
        list = new ArrayList();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public void push(E e){
        list.add(list.size(),e);
    }

    @Override
    public E pop(){
        E e = list.remove(list.size()-1);
        return e;
    }

    @Override
    public E peek(){
        return list.get(list.size()-1);
    }

    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("ArrayStack size = %d :\n",list.size()));
        res.append("[");
        for (int i =0 ; i<list.size() ; i++) {
            res.append(list.get(i));
            if (i != list.size()-1){
                res.append(",");
            }
        }
        res.append("]top");
        return res.toString();
    }

}
