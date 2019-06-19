package cn.lcools.datastructure.arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = new int[10];
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=i;
        }
        int[] scores = new int[]{99,44,66};
        for (int i=0 ; i<scores.length ; i++){
            System.out.println(scores[i]);
        }
        for(int score : scores){
            System.out.println(score);
        }
        Array<Integer> a = new Array();
        for (int i=0 ; i<10 ; i++)
            a.addLast(i);
        System.out.println(a);
        a.add(1,100);
        System.out.println(a);
        a.addFirst(-1);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.removeElement(-1);
        System.out.println(a);
        a.remove(2);
        a.remove(2);
        a.remove(2);
        a.remove(2);
        a.remove(2);
        System.out.println(a);

        ArrayStack<Integer> stack = new ArrayStack<>();
        for(int i= 0 ; i<5 ;i++){
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());


        ArrayQueue<Integer> queue = new ArrayQueue();
        for(int i= 0 ; i<5 ;i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
        queue.enqueue(5);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.getFront());

        LoopQueue<Integer> loopqueue = new LoopQueue<>();
        for(int i= 0 ; i<10 ;i++){
            loopqueue.enqueue(i);
        }
        System.out.println(loopqueue);
        loopqueue.enqueue(5);
        System.out.println(loopqueue);
        loopqueue.dequeue();
        loopqueue.dequeue();
        loopqueue.dequeue();
        loopqueue.dequeue();
        loopqueue.dequeue();
        System.out.println(loopqueue);
        loopqueue.dequeue();
        System.out.println(loopqueue);
        loopqueue.enqueue(9);
        loopqueue.enqueue(9);
        loopqueue.enqueue(9);
        loopqueue.enqueue(9);
        loopqueue.enqueue(9);
        loopqueue.enqueue(9);
        System.out.println(loopqueue.getFront());
    }
}
