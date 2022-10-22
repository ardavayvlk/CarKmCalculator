import java.util.Scanner;

public class arabaKmCalculator {
    public static void main(String[] args){
        /*
        * bir aracın ne kadar yol gittiğini ve kaç km yaktığını sorun ve sürücünün ne kadar ödemesi gerektiğini bulun.
        *
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("arabanız ne kadar yakıyor? ");
        double yakit = scanner.nextDouble();
        System.out.print("arabanız kaç km?");
        double km = scanner.nextDouble();
        System.out.println("toplam ödemeniz gereken tutar tolam: " + (yakit*km) + "tl'dir");
    }
}
