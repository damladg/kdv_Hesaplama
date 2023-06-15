import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18, kdvTutar , kdvliTutar , toplamTutar;

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz : ");
        tutar = scan.nextDouble();

        kdvTutar = tutar * kdvOran ;
        kdvliTutar = tutar * kdvTutar;


        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'Lİ TUTAR : " + kdvliTutar);*/



        // ÖDEV:
        // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
        // tutar 1000 TL'den büyük ise KDV oranını %8
        // olarak KDV tutarı hesaplayan programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Tutarı girin: ");
        tutar = scan.nextDouble();

        double kdvOrani;

        if (tutar >= 0 && tutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        kdvTutar = tutar * kdvOran;
        toplamTutar = tutar + kdvTutar;

        System.out.println("KDV Tutarı: " + kdvTutar );
        System.out.println("Toplam Tutar: " + toplamTutar );
    }

}

