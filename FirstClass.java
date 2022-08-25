import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstClass {
    public static void main(String[] args) {
        /*
        String isim = "Arif";
        String soyisim = "ERMİŞ";
        String cinsiyet = "E";
        int yas = 26;
        System.out.println("Merhaba");

        if (cinsiyet == "E") {
            System.out.println(isim + " Bey");
        } else if (cinsiyet == "K") {
            System.out.println(isim + " Hanım");
        } else {
            System.out.println("Lütfen geçerli bir cinsiyet girin");
        }

        if (yas < 20) {
            System.out.println("Y Kuşağı");
        } else if (yas >= 20) {
            System.out.println("Z Kuşağı");
        }

        Date today = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(today);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(Calendar.YEAR);
        System.out.println(today.toString().split(" ")[5]);
        System.out.println(today);
*/
/*
        for (int i = 1; i <= 10; i++) {
            System.out.println("--------------------------------------------");
            System.out.println(i + ". Sonuç:");
            for (int x = 1; x <= 10; x++) {
                int result = i * x;
                System.out.print(i + " x " + x + " : ");
                System.out.println(result);
            }
        }
 */
        /*
        int a = 1;
        int sonuc = a;
        do {
            sonuc = a++;
            System.out.println(sonuc);
        } while(sonuc < 10);
*/
/*
        int sayi = 99;
        int say = sayi;

        do {
            say = sayi--;
            System.out.print("-> ");
            System.out.println(say);
        } while (say > 2);
*/
/*
        for (int i = 1; i < 100; i++){
            if (i%4 == 0){
                continue;
            }
            System.out.println(i);
        }
*/
/*
        Calculator hesap1 = new Calculator();
        System.out.print("Toplama: ");
        System.out.println(hesap1.topla(2, 6, 7));
        System.out.print("Çıkarma: ");
        System.out.println(hesap1.cikar(10, 3));
        System.out.print("Çarpma: ");
        System.out.println(hesap1.carpma(2, 3, 4, 2));
        System.out.print("Bölme: ");
        System.out.println(hesap1.bolme(12, 3));

 */

        /*
        String[] list = new String[10];

        list[0] = "Arif ERMİŞ";
        list[1] = "Şamil ÜNAL";
        list[2] = "Kübra AKKUŞ";
        list[3] = "Cengiz ŞEN";
        list[4] = "Hicran ÇİFTÇİ";
        list[5] = "Gülseren GÜL";
        list[6] = "Mete Kaan ŞAHİN";
        list[7] = "Ebubekir DURUKAL";
        list[8] = "Oğuzhan MERİÇ";
        list[9] = "Hilmi CAN";

        for (String i : list) {
            System.out.print("İsim Soyisim: ");
            System.out.println(i);
        }

         */

    }
}
