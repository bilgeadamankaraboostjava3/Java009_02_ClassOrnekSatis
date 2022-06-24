package com.satis;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import com.satis.entity.Satis;
import com.satis.entity.Urun;


public class Runner {

	public static void main(String[] args) {
		String kasiyer = "Canan KONUÞKAN";
		System.out.println("***********************************");
		System.out.println("*****   SATIÞ OTOMASYONU   ********");
		System.out.println("***********************************");
		System.out.println();
		System.out.println("1- Satýþ Yap");
		System.out.println("2- Satýþ Listele");
		System.out.println("3- Ürün Ekleme");
		System.out.println("4- Ürün Listele");
		System.out.println("0- ÇIKIÞ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Ürün adý...: ");
		String urunAdi = sc.nextLine();		
		System.out.print("Marka......: ");
		String marka = sc.nextLine();		
		System.out.print("Model......: ");
		String model = sc.nextLine();		
		System.out.print("Fiyat......: ");
		double fiyat = Double.parseDouble(sc.nextLine()); // String tipinde double alýnacak 124,25
														// string ifade double a çevirilecek.
		System.out.print("Adet.......: ");
		int adet = Integer.parseInt(sc.nextLine());
		Satis satis = new Satis();
		satis.adet = adet;
		satis.birimfiyat = fiyat;
		satis.kasiyer = kasiyer;
		//satis.tarih = new Date().toString();
		satis.tarih = LocalDate.now().toString();
		satis.toplamfiyat = adet * fiyat;
		satis.urun = new Urun();
		satis.urun.ad = urunAdi;
		satis.urun.fiyat = fiyat;
		/**
		 * Soru- Bu satþý iþleminde ne hangi ürün satýlmýþtýr nasýl gösteriririm.
		 * 
		 */
		System.out.println("Ürün adý...: "+satis.urun.ad);
		System.out.println("Ürün adý...: "+satis.tarih);
		
	}

}
