import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double perKm = 2.2;
        double total=10;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km olarak giriniz");
        km =input.nextInt();

        total+=(km*perKm);

        total=(total<20)?20 : total;

        System.out.print("Toplam tutar "+total );
    }
}