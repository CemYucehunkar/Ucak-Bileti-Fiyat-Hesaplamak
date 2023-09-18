import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mesafe ,yaş ve yolculuk tipi gibi 3 adet değişken alacağız.
        // Bunlar tam sayı olacağı için int ile çekebiliriz.


        int yas, km, tip;
        double ücret = 0.10, toplam;

        Scanner input = new Scanner(System.in);


        // Kullanıcıdan değerler alacağımız diziler oluşturalım

        System.out.print("Yaşınızı Giriniz :");
        yas = input.nextInt();


        System.out.print("Gideceğiniz Km: ");
        km = input.nextInt();

        System.out.println("Yolculuk Şeklini Seçin İçin: \n Gidiş:1\n Gidiş-Dönüş:2 ");

        System.out.print("Yolculuk Şeklinizi Seçiniz :");
        tip = input.nextInt();


        // Koşul ifadeleri oluşturalım.
        // 1. Koşul Kişinin yaş aralığı

        if (yas < 12) {
            if (tip == 1) {
                System.out.print(" Toplam Ücretiniz:" + (km * ücret) * (0.5) + ("TL"));

            }  else if (tip==2){
                System.out.print("Toplam Ücretiniz:" + ((2 * km * ücret) * (0.5)) * (0.8) + "TL");

            } else {
                System.out.print("Yanlış bir değer girdiniz tekrar deneyiniz.");
            }
            // yolu 2 kere yapacağı için km *2  ve toplam ücret üstünden gidiş dönüş indirimi olan %20 yi bu şekilde hesapladım
            // Yaşı da 12 den küçük olduğu için %50 indirimi de yol*ücrete ilave olarak ekledım

        } else if (yas >= 12 && yas < 24) {

            if (tip == 1) {
                System.out.print(" Toplam Ücretiniz:" + (km * ücret) * (0.9) + ("TL"));

            } else if(tip==2) {
                System.out.print("Toplam Ücretiniz:" + ((2 * km * ücret) * (0.9)) * (0.8) + "TL");

            } else {
                System.out.print("Yanlış bir değer girdiniz tekrar deneyiniz.");
            }
        } else if (yas >= 24 && yas <= 65) {
            if (tip == 1) {
                System.out.print(" Toplam Ücretiniz:" + km * ücret + "TL");

            } else if (tip == 2) {
                System.out.print("Toplam Ücretiniz:" + (km * ücret) * (0.8) + "TL");

            }else {
                System.out.print("Yanlış bir değer girdiniz tekrar deneyiniz.");
            }
        } else if (yas > 65) {
            if (tip == 1) {
                System.out.print(" Toplam Ücretiniz:" + (km * ücret) * (0.7) + "TL");

            } else if (tip == 2) {
                System.out.print("Toplam Ücretiniz:" + ((2. * km * ücret) * (0.7)) * (0.8) + "TL");


            } else {
                System.out.print("Yanlış bir değer girdiniz tekrar deneyiniz.");
            }

        }
    }
}
