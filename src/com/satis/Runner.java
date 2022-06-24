package com.satis;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import com.satis.entity.Satis;
import com.satis.entity.Urun;


public class Runner {

	public static void main(String[] args) {
		String kasiyer = "Canan KONU�KAN";
		System.out.println("***********************************");
		System.out.println("*****   SATI� OTOMASYONU   ********");
		System.out.println("***********************************");
		System.out.println();
		System.out.println("1- Sat�� Yap");
		System.out.println("2- Sat�� Listele");
		System.out.println("3- �r�n Ekleme");
		System.out.println("4- �r�n Listele");
		System.out.println("0- �IKI�");
		Scanner sc = new Scanner(System.in);
		System.out.print("�r�n ad�...: ");
		String urunAdi = sc.nextLine();		
		System.out.print("Marka......: ");
		String marka = sc.nextLine();		
		System.out.print("Model......: ");
		String model = sc.nextLine();		
		System.out.print("Fiyat......: ");
		double fiyat = Double.parseDouble(sc.nextLine()); // String tipinde double al�nacak 124,25
														// string ifade double a �evirilecek.
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
		 * Soru- Bu sat�� i�leminde ne hangi �r�n sat�lm��t�r nas�l g�steriririm.
		 * 
		 */
		System.out.println("�r�n ad�...: "+satis.urun.ad);
		System.out.println("�r�n ad�...: "+satis.tarih);
		
	}

}
