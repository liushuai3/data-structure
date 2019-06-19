package cn.lcools.datastructure.arrays;

/**
 * Created by liushuai3 on 2019/6/18.
 * 动态数组
 */
public class Array<E> {
    private E data[];
    private int size;

    /**
     * @param capacity
     * */
    public Array(int capacity){
        data = (E[])new Object[capacity];
    }

    /**
     * 无参构造函数，默认容量为10
     * */
    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public void addLast(E e){
        add(size,e);
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void add(int index, E e){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("fail");
        }
        if(size == data.length){
            resize(2 * data.length);
        }
        for(int i = size-1 ; i >= index ; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity];
        for (int i=0 ; i<size ; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public E get(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("fail");
        }
        return data[index];
    }

    public void set(int index, E e){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("fail");
        }
        data[index]=e;
    }

    public boolean contains(E e){
        for(int i=0 ; i<size ; i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    public int find(E e){
        for(int i=0 ; i<size ; i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public E remove(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("fail");
        }
        E ret = data[index];
        for(int i=index ; i<size ; i++){
            data[i] = data[i+1];
        }
        size --;
        data[size] = null;
        if(size == data.length/4 && data.length/2 != 0){
            resize(data.length/2);
        }
        return ret;
    }

    public void removeElement(E e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }



    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        res.append("[");
        for (int i = 0 ; i<size ; i++){
            res.append(data[i]);
            if(i != size-1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }

}
