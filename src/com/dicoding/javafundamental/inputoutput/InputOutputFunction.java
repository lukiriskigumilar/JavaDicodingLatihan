package com.dicoding.javafundamental.inputoutput;
import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("program penjumlahan sederhana");
        System.out.print("masukan angka pertama : ");
        int value = scanner.nextInt();
        System.out.print("masukan angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("hasilnya adalah : " + result );

    }
}
