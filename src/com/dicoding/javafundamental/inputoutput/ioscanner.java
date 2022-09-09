package com.dicoding.javafundamental.inputoutput;
import java.util.Scanner;

public class ioscanner {

    public static void main (String[] args){
        Scanner  input = new Scanner(System.in);
        System.out.println("duplikasi  kata");
        var kata = input.next();
        var Result  = kata;
        System.out.println("kata yang anda masukan adalah " + Result);
    }

}
