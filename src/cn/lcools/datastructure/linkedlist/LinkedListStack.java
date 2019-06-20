package cn.lcools.datastructure.linkedlist;

import cn.lcools.datastructure.arrays.Stack;

/**
 * Created by liushuai3 on 2019/6/20.
 */
public class LinkedListStack<E> implements Stack<E> {
    private LinkList<E> list;

    public LinkedListStack(){
        list = new LinkList();
    }
    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);

    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("ArrayStack size = %d :\n",list.getSize()));
        res.append("top[");
        for (int i =0 ; i<list.getSize() ; i++) {
            res.append(list.get(i));
            if (i != list.getSize()-1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
