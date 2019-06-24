package cn.lcools.datastructure.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<>();
        for (int i = 0; i < 5; i++) {
            linkList.addFirst(i);
            System.out.println(linkList);
        }
        linkList.add(2,666);
        System.out.println(linkList);
        linkList.remove(2);
        System.out.println(linkList);
        linkList.removeFirst();
        System.out.println(linkList);
        linkList.removeLast();
        System.out.println(linkList);

        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        LinkedListQueue queue = new LinkedListQueue();
        for(int i=0;i<10;i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
        queue.enqueue(-1);
        System.out.println(queue);
        queue.enqueue(-2);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.getFront());

    }
}
