import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sicakligini giriniz: ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsin.");
        } else if (heat < 15) {
            System.out.println("Sinemaya gidebilirsin.");
            if (heat > 10) {
                System.out.println("Pikniğe gidebilirsin.");
            }
        } else if (heat <= 25) {
            System.out.print("Pikniğe gidebilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
