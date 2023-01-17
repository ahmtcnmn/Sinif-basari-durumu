import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int mat, kim, fiz, turk, muz, top = 0;

        out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if ((mat <= 100) && (mat > 0)) {
            top += mat;
        }
        out.print("Fizik notunuzu giriniz : ");
        fiz = input.nextInt();
        if ((fiz <= 100) && (fiz > 0)) {
            top += fiz;
        }
        out.print("Kimya notunuzu giriniz : ");
        kim = input.nextInt();
        if ((kim <= 100) && (kim > 0)) {
            top += kim;
        }
        out.print("Türkçe notunuzu giriniz : ");
        turk = input.nextInt();
        if ((turk <= 100) && (turk > 0)) {
            top += turk;
        }
        out.print("Müzik notunuzu giriniz : ");
        muz = input.nextInt();
        if ((muz <= 100) && (muz > 0)) {
            top += muz;
        }
        int sonuc = top / 5;
        if (sonuc > 55) {
            out.print("Tebrikler.Sınıfı geçtiniz : " + sonuc);
        } else {
            out.print("Üzgünüm sınıfı geçemediniz : " + sonuc);
        }
    }
}