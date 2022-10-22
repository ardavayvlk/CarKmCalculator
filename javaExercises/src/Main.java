import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Merhaba lütfen kilonuzu giriniz: ");
        int kilo = scanner.nextInt();
        System.out.print("lütfen boyunuzu giriniz: (Örnek: 1,72)");
        double boy = scanner.nextDouble();
        double bki = kilo / (boy*boy);
        System.out.println("beden kitle indeksiniz: " + bki);
    }
}