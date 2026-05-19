package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];

    }
    public boolean isFull(){
        return size == data.length;

    }

public void add(int num){
    if(isFull()){
        resize();
    }
    data[size++] = num;
}

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }
    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the current items in the new array
        for(int i = 0; i < data.length; i++) {
            temp [i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add (45) ;
//        list. remove ( 0);
//        list.get(0) ;
//        list. set (1, 6789);
//        list. size();
//        list. isEmpty() ;
//        System.out.println(list);

        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(43);
        list.add(432);
        list.add(2345);
        System.out.println(list.toString());


    }
}
