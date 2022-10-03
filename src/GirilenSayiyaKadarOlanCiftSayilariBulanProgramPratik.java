import java.util.Scanner;
//VMA9 Muhammet Ali Velibeyoğlu
public class GirilenSayiyaKadarOlanCiftSayilariBulanProgramPratik {
    public static void main(String[] args) {
        double n, total = 0, loop = 0;

        System.out.println("Bu program 3 veya 4'e tam bölünen sayıların ortalaması ve toplamını vermektedir.");
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            n = input.nextDouble();

            if ((n % 3 == 0) || (n % 4 == 0)) {
                total += n;
                loop += 1;
            }
        } while (n > 0);

        double avarage;
        avarage = total / loop;
        System.out.println("Toplamı : " + total);
        if (total <= 0) {
            System.out.println("Yazılan sayılar 3 veya 4'e tam bölünen sayılar değildir.");
        } else {
            System.out.println("Ortalaması : " + avarage);
        }

        System.out.println("Program Bitti. ");

    }
}
