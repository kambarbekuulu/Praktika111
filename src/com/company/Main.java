package com.company;

public class Main {

    public static void main(String[] args) {
        int[] massiv = new int[]{1,3,-4,-4,-10,23,};
        int sumMas = 0;
        for (int i = 0; i < massiv.length; i++) {
             if (massiv[i] > 0){
                 sumMas+=massiv[i];
             }

        }  System.out.println(sumMas);

    }
}
