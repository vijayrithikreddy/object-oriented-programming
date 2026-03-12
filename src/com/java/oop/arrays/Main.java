package com.java.oop.arrays;

public class Main {
    static void main(String[] args) {
        int[] ids;
        ids = new int[5];
        System.out.println(ids[0]);//output : 0
        ids[0] = 100;
        ids[1] = 200;
        ids[2] = 300;
        ids[3] = 400;
        ids[4] = 500;

        System.out.println(ids[2]);
        //for loop
        for (int i = 0; i < ids.length; i++){
            System.out.println(ids[i]);
        }
        // for each loop  NOTE : used only for reading the data in array
        for (int id : ids){
            System.out.println(id);
        }

        // updating
        for (int i = 0; i < ids.length; i++){
            ids[i] += 10000;
        }
        for (int id : ids){
            System.out.println(id);
        }

        // character array
        char[] ch = {'a','b','c','d','e'};

        for (char c : ch){
            System.out.println(c);
        }
    }

}
