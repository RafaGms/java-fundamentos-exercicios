import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var currentYear = OffsetDateTime.now().getYear();

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite o ano que voce nasceu:");
        int year = scanner.nextInt();

        var age = currentYear - year;

        System.out.println("Olá " + name + " você tem " + age + " anos");
        scanner.close();
    }
}
