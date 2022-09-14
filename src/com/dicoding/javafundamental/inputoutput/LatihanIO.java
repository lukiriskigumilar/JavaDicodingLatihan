package com.dicoding.javafundamental.inputoutput;
import java.util.Scanner;

    public class LatihanIO {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            double pi ,r,luas;

            pi= 3.14;
            System.out.println("Masukan Nilai r ");
            r = input.nextDouble();

            luas = pi*r*r;
            System.out.println("Luas Lingkaram Adalah " + luas);







        }

}
