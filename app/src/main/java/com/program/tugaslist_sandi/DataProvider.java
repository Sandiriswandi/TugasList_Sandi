package com.program.tugaslist_sandi;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.program.tugaslist_sandi.model.Air;
import com.program.tugaslist_sandi.model.Hewan;
import com.program.tugaslist_sandi.model.Darat;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Darat> initDataDarat(Context ctx) {
        List<Darat> darats = new ArrayList<>();
        darats.add(new Darat("Beruang", "Nepal, Pakistan, and India Timur",
                "Beruang adalah binatang dalam kelas mamalia yang tergolong ordo Carnivora, familia Ursidae.", R.drawable.darat_beruang));
        darats.add(new Darat("Citah", "Afrika",
                "Cetah adalah anggota keluarga kucing (Felidae) yang berburu mangsa dengan menggunakan kecepatan dan bukan taktik mengendap-endap atau bergerombol", R.drawable.darat_citah));
        darats.add(new Darat("Harimau", "Asia Tenggara, Asia Selatan",
                "Harimau (Panthera tigris) adalah spesies kucing terbesar yang masih hidup dari genus Panthera. Harimau memiliki ciri loreng yang khas pada bulunya.", R.drawable.darat_harimau));
        darats.add(new Darat("Macan Kumbang", "Indonesia",
                "acan kumbang adalah salah satu subspesies dari macan tutul yang hanya ditemukan di hutan tropis, pegunungan dan kawasan konservasi Pulau Jawa, Indonesia.", R.drawable.darat_macanh));
        darats.add(new Darat("Singa", "Afrika, Eropa, Timur Tengah",
                "Singa (bahasa Sanskerta : Siṃha, atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing.", R.drawable.darat_singa));
    return darats;

    }

    private static List<Air> initDataAir(Context ctx) {
        List<Air> Airs = new ArrayList<>();
        Airs.add(new Air("Buaya", "Asia dan Eropa",
                "BUAYA adalah hewan yang pernah hidup bersama dinosaurus, tetapi selamat dari kepunahan massal dan bertahan hidup sampai zaman modern sekarang.", R.drawable.air_buaya));
        Airs.add(new Air("Hiu", "Samudara Asia dan Eropa",
                "Ikan Hiu adalah sekelompok (superordo Selachimorpha) ikan dengan kerangka tulang rawan yang lengkap [1] dan tubuh yang ramping.", R.drawable.air_hiu));
        Airs.add(new Air("Pari", "Samudra Asia dan Eropa",
                "kan pari atau ikan peh adalah jenis ikan laut yang memiliki 560 spesies dan tergolong dalam 13 famili.", R.drawable.air_pari));
        Airs.add(new Air("Paus", "Samudra Asia dan Eropa",
                "Paus atau lodan (khusus yang bergigi dan bukan berukuran kecil) adalah kelompok mamalia yang hidup di lautan.", R.drawable.air_paus));
        Airs.add(new Air("Ubur-ubur", "Samudra Asia dan Eropa",
                "Ubur-ubur adalah hewan laut berbentuk seperti agar-agar yang terkenal dengan sengatannya", R.drawable.air_ubur));

        return Airs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataDarat(ctx));
        hewans.addAll(initDataAir(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
