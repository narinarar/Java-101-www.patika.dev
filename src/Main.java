import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzık;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        matematik = scanner.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = scanner.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih = scanner.nextInt();

        System.out.println("Müzik Notunuzu Giriniz: ");
        muzık = scanner.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzık);
        double ort = toplam / 6;

        System.out.println("Not Ortalamanız: " + ort);

        String durum = (ort >= 60) ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız.";
        System.out.println(durum);


    }

    }