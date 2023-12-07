import java.util.Scanner;
public class skaitamlidz10 {
    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Ievadi vārdu/teikumu:");
        String vards = skeneris.nextLine();
        System.out.println("varda/teikuma ir " + vards.length() + " simboli.");
    }
}
