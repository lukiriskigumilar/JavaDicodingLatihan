package com.dicoding.javafundamental.percabangan;

public class IfthenElseifThenelse {
    public static void main(String[] args){

        int NilaiUjian = 50;
        char IndeksPrestasi;

        if (NilaiUjian >= 90){
            IndeksPrestasi = 'A';
        } else if (NilaiUjian >=80) {
            IndeksPrestasi = 'B';
        } else if (NilaiUjian >= 70) {
            IndeksPrestasi = 'C';
        } else if (NilaiUjian >= 60) {
            IndeksPrestasi = 'D';
        } else if (NilaiUjian >= 50) {
            IndeksPrestasi = 'E';
        } else if (NilaiUjian >= 40) {
            IndeksPrestasi = 'F';
        } else {
            IndeksPrestasi = 'G';
        }
        System.out.println("Nilai ujian akhir anda Adalah " + IndeksPrestasi);
    }
}
