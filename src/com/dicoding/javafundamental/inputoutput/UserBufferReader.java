package com.dicoding.javafundamental.inputoutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UserBufferReader {

    public static void main (String[] args){
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("PROGRAM PENJUMLAHAN SEDERHANA");
        int value = 0 ;
        int anotherValue = 0 ;
        try {
            System.out.print("MASUKAN ANGKA PERTAMA : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka ke 2 : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }
        int resul = value + anotherValue;
        System.out.print("Hasilnya adalah : " + resul);
    }

}
