package cn.lcools.datastructure.linkedlist;

import cn.lcools.datastructure.arrays.Queue;

/**
 * Created by liushuai3 on 2019/6/24.
 */
public class LinkedListQueue<E> implements Queue<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e,Node next){
            this.next = next;
            this.e=e;
        }
        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    private Node head,tail;
    private int size;

    public LinkedListQueue(){
        head=null;
        tail=null;
        size=0;
    }

    @Override
    public void enqueue(E e) {
        if(tail==null){
            tail = new Node(e);
            head =tail;
        }else {
            tail.next=new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalArgumentException("fail");
        }
        Node retNode = head;
        head = head.next;
        retNode.next=null;
        if(head==null){
            tail=null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public E getFront() {
        if(isEmpty()){
            throw new IllegalArgumentException("fail");
        }
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        res.append("Queue:front ");
        Node cur = head;
        while (cur!=null){
            res.append(cur+"-->");
            cur=cur.next;
        }
        res.append("NULL tail");
        return res.toString();
    }
}
