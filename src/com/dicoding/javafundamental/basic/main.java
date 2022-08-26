package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class main {
    public static void main (String[] args){
        System.out.println("Hellow world");
        Gitar.bunyi();

        Mobil.JumlahBan();
        Motor.JumlahBan();
        Kereta.JumlahBan();

        Date today = new Date();
        System.out.println("hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("BESOK = " + tomorrow);

        String dicoding = "dicoding";
        String result = dicoding.trim();
        System.out.println(result);

    }
}
