import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        if (!name.isEmpty() && !name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba")) {
            System.out.println("Jesteś mężczyzną");
        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Jesteś kobietą");
        } else {
            System.out.printf("Podaj imię, imię nie może być puste");
        }

        System.out.println("Hello " + name);

        Scanner scanner_age = new Scanner(System.in);

        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
        System.out.println(name + " masz " + age + " lat.");

        for (int i = 0, j = 10; i < 100; i += j) {
            System.out.println(i);
            System.out.println(j);
        }

        int a = 15;
        int b = 11;

        for (;a<354353; a = a*b ) {
            System.out.println(a);
        }

        System.out.printf("TU JEST WHILE");
        System.out.printf("");

        int i = 1;

        while (i<10) {
            System.out.println("i="+ i+ " i jest mniejsze od 10");
            i++;
        }

        System.out.println("Tu jest DO");
        System.out.println("do while ->najpierw przechodzimy przez pętle, a później sprawdzamy warunek");
        System.out.println("do while wykona się za każdym razem przynajmniej raz");
        System.out.printf("");

        var abc = 30;
        var def = 20;

        do {
            System.out.printf("abc=%d jest większe od def=%d", abc, def);
            System.out.println("");
            abc *= 0.99;
        }
        while (abc>def);

        System.out.println("");
        System.out.println("BREAK");

        for (int x = 0; x <10; x++) {
            if (x == 4) {
                break;
            }
            System.out.println(x);
        }

        System.out.println("");
        System.out.println("CONTINUE");

        for (int x = 0; x <10; x++) {
            if (x == 4) {
                continue;
            }
            System.out.println(x);
        }

    }
}