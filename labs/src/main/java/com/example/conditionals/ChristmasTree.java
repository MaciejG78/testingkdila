package conditionals;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChristmasTree {

    int treeSize;

    public static void main(String[] args) throws InterruptedException {
        ChristmasTree christmasTree = new ChristmasTree();
        christmasTree.christmasTree();
    }

    public void christmasTree() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilość poziomów drzewka wysokość: ");
        treeSize = scanner.nextInt();

        this.printChristmasTree(treeSize);
    }

    private void printChristmasTree(int treeSize) throws InterruptedException {
        String emptySign = " ";
        String starSign = "*";
        int j = treeSize-1;
        // v1
        for (int i = 0; i < treeSize; i++) {
            System.out.println(emptySign.repeat(j) + starSign.repeat(i*2+1));
            j--;
        }

        // v2
//        for (int i = 0; i < treeSize-1; i++) {
//            System.out.println(emptySign.repeat(Math.abs(i-(treeSize-2))) + starSign.repeat(i*2+1));
//        }

        System.out.println(emptySign.repeat(treeSize-3) + "***");
        TimeUnit.SECONDS.sleep(1);
    }
}







