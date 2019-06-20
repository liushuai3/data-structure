package cn.lcools.datastructure.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushuai3 on 2019/6/19.
 * 动态数组队列
 */
public class ArrayQueue<E> implements Queue<E>{

    private List<E> array;

    public ArrayQueue(){
        array = new ArrayList<>();
    }

    @Override
    public void enqueue(E e) {
        array.add(array.size(),e);

    }

    @Override
    public E dequeue() {
        return array.remove(0);
    }

    @Override
    public E getFront() {
        return array.get(0);
    }

    @Override
    public int getSize() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("ArrayQueue size = %d :\n",array.size()));
        res.append("out[");
        for (int i =0 ; i<array.size() ; i++) {
            res.append(array.get(i));
            if (i != array.size()-1){
                res.append(",");
            }
        }
        res.append("]in");
        return res.toString();
    }
}
