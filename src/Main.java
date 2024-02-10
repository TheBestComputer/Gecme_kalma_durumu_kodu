
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Matematik Notunuz : ");
        mat = scanner.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = scanner.nextInt();
        System.out.print("Turkce Notunuz : ");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = scanner.nextInt();
        System.out.print("Muzik Notunuz : ");
        muzik = scanner.nextInt();
        
        double notOrtalamasi = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        
        System.out.println("Ortalamaniz : " + notOrtalamasi);
        
        String gecmeDurumu = notOrtalamasi < 60 ? "Kaldi" : "Gecti";
        System.out.println("Gecme Durumu : " + gecmeDurumu);
        
    }
}
