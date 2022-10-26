import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame la base imponible: ");
        float baseImponible = sc.nextFloat();

        System.out.print("\nDame el IVA que se debe aplicar: ");
        float iva = sc.nextFloat();

        float ivaPagar = (baseImponible*iva)/100;
        float total = baseImponible + ivaPagar;

        System.out.println("\nTotal: " +total);
    }
}