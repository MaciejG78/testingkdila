package conditionals;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectangleMethod();
    }
    /*Jako parametry wejściowe przekazujemy wysokość i szerokość prostokąta, wyliczmy metodą
   Pole i obwód, drugą metodą rysujemy prostokąt:
   h=4 w=6         h=2, w=2
           ******   **
           *    *   **
           *    *
           ******
   Dodatkowo można weryfikować czy wartość podana h i w jest >= 2
   (Jak nie to ponownie oczekujemy na wprowadzenie wartości h i w wyświetlając stosowny komunikat)
    */
    public void rectangleMethod() {
        Scanner scanner = new Scanner(System.in);
        int h;
        int w;
        do {
            System.out.println("Podaj wysokość prostokąta (wartość musi być większa, równa 2): ");
            h = scanner.nextInt();
        } while (h < 2);

//        System.out.print("Podaj wysokość prostokąta (wartość musi być większa, równa 2): ");
//        int h = scanner.nextInt();
//        if (h < 2) {
//            System.out.println("Podana wartość jest mniejsza od 2, podaj jeszcze raz tym razem większą lub równą 2.");
//            h = scanner.nextInt();
//        }
        do {
            System.out.println("Podaj szerokość prostokąta (wartość musi być większa, równa 2): ");
            w = scanner.nextInt();
        } while (w < 2);
//        System.out.print("Podaj szerokość prostokąta (wartość musi być większa, równa 2): ");
//        int w = scanner.nextInt();
//        if (w < 2) {
//            System.out.println("Podana wartość jest mniejsza od 2, podaj jeszcze raz tym razem większą lub równą 2.");
//            w = scanner.nextInt();
//        }
//        while (w < 2) {
//            System.out.println("Podana wartość jest mniejsza od 2, podaj jeszcze raz tym razem większą lub równą 2.");
//            w = scanner.nextInt();
//        }
//        do {
//            System.out.println("Podana wartość jest mniejsza od 2, podaj jeszcze raz tym razem większą lub równą 2.");
//            w = scanner.nextInt();
//        } while (w < 2);
        calculateRectangle(h, w);
        printRectangle(h, w);
    }

    private void calculateRectangle(int wys, int szer) {
        int pole = wys*szer;
        int obwod = 2*wys + 2*szer;
        System.out.println("Pole prostokąta wynosi: " + pole + ",  obwod tego prostokąta wynosi: " + obwod);
    }

    private void printRectangle(int h, int w) {
        String star = "*";
        String empty = " ";

        for (int i = 1; i <= h; i++) {
            if (i == 1 || i == h) {
                System.out.println(star.repeat(w));
            }
            else {
                System.out.println(star + empty.repeat(w-2) + star);
            }
        }
        System.out.println("koniec...");
    }
}
