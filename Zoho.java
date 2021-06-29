import java.util.Scanner;

public class Zoho {

    public static void main(String args[]) throws Exception {
        int printIndex;
        char[] ch;
        String word;
        int center;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        word = sc.next();
        if (word != null && word != "") {
            word = word.trim();
            ch = word.toCharArray();
            center = ch.length / 2;
            for (int loop1 = ch.length - 1; loop1 >= 0; loop1--) {
                printIndex = center;
                for (int loop2 = 0; loop2 < ch.length; loop2++) {
                    if (loop2 >= loop1) {
                        System.out.print(ch[printIndex]);
                        printIndex++;
                        if (printIndex > ch.length - 1) {
                            printIndex = 0;
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
