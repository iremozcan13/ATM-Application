package com.packagejava;

import java.util.Scanner;
//ATM

public class Main23 {

	public static void main(String[] args) {
		// ATM
		int kartSifresi=1234;
		int bakiye=1000;
		int denemeHakki=3;
		String islem;
		int sifre;
		int cekilecekMiktar;
		int yatirilacakMiktar;
		Scanner girdi = new Scanner(System.in);
        
		System.out.println("Bankamatiğe Hoşgeldiniz :)");
		
		while(denemeHakki>0) {
			System.out.println("Lütfen şifrenizi giriniz:");
			sifre=girdi.nextInt();
			
			if(kartSifresi!=sifre) {
				System.out.println("Girdiğiniz şifre hatalı lütfen tekrar deneyiniz!");
				denemeHakki--;
				if(denemeHakki>0) {
					System.out.println(denemeHakki + "deneme hakkınız kaldı.");
				}else {
					System.out.println("Şifre deneme hakkınız kalmadı,kartınız bloke edilmiştir.");
				}
				continue;
				
			}
			 while(true) {
			    	System.out.println("Yapmak istediğiniz işlemi seçiniz:");
			    	System.out.println("                          :)                            ");
			    	System.out.println("1-Para Çekme");
			    	System.out.println("2-Para Yatırma");
			    	System.out.println("3-Bakiye Sorgulama");
			    	System.out.println("4-Çıkış");
                    islem=girdi.next();
			 
                    if(islem.equals("1")) {
                    	System.out.println("Çekilecek para miktarını giriniz:");
                    	cekilecekMiktar=girdi.nextInt();
                    	if(cekilecekMiktar>bakiye) {
                    		System.out.println("Yetersiz bakiye !!!");
                    	}else {
                    		if(cekilecekMiktar>=50) {
                    	      bakiye=bakiye-cekilecekMiktar;
                    		}else {
                    			System.out.println("50 tl ve üstünü çekebilirsiniz.");
                    		}
                    	}
                    }else if(islem.equals("2")){
                    	System.out.println("Yatırmak istediğiniz para miktarını giriniz:");
                    	yatirilacakMiktar=girdi.nextInt();
                        bakiye=bakiye+yatirilacakMiktar;
                    }else if(islem.equals("3")) {
                 	   System.out.println("Bakiyeniz:" + bakiye);
                    }else if(islem.equals("4")) {
                    	System.out.println("Çıkış yapıldı.İyi günler dileriz :)");
                    return;
                }else {
            	  System.out.println("Geçersiz işlem,lütfen tekrar deneyiniz :(");
                }
             }
		}
    }
}

