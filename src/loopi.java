import java.util.Scanner;
public class loopi {
    public static void main(String[] args){
    int a = 0;
    int b = 1;
    int i = 0;
    Scanner skeneris = new Scanner(System.in);
        System.out.println("kuru virknes locekli velies redzet?");
        int t = skeneris.nextInt();
    while (i <= t) {
        a = a + b;
        i = i + 1;
        b = a + b;
        i = i + 1;
    }

    if (a < b && b > 0) {
        System.out.println(t + ". virknes loceklis ir " + b);
    }
    if (b < a && a > 0) {
        System.out.println(t + ". virknes loceklis ir " + a);
    }
    else {
        System.out.println("virknes " + t + ". loceklis arpus 32-bitu integer limita");
    }
    }
}
