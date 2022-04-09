
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Matematik notunuzu girin:");
                int mat = input.nextInt();
                System.out.print("Fizik notunuzu girin:");
                int fizik = input.nextInt();
                System.out.print("Kimya notunuzu girin:");
                int kimya = input.nextInt();
                System.out.print("Müzik notunuzu girin:");
                int muzik = input.nextInt();
                System.out.print("Tarih notunuzu girin:");
                int tarih = input.nextInt();
                System.out.print("Türkçe notunuzu girin:");
                int turkce = input.nextInt();
                double sonuc = (double)(mat + fizik + tarih + kimya + muzik + turkce) / 6.0D;
                System.out.println("Ortalamanız:" + sonuc);
                String durum = sonuc > 60.0D ? "Gecti" : "Kaldı";
                System.out.println(durum);
        }
    }
