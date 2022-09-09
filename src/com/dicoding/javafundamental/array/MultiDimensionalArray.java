package com.dicoding.javafundamental.array;

public class MultiDimensionalArray {
    public static void main(String[] args){
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new  char[3];
        //Dimensi 1 yang indeks nua 0 memiliki 2 elemnt
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

        //Dimensi 1 yang indeksnya 1 memiliki panjang 3 elemn
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);
    }


    }
