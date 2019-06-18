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
        Array<Integer> a = new Array(20);
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
    }
}
