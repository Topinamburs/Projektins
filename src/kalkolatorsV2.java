import java.util.Scanner;
public class kalkolatorsV2 {
    public static void main(String[] args){
        Scanner skeneris = new Scanner(System.in);

        System.out.println("disclaimer -> kalkolators ir domats dauniem tadel visu noapalo lidz veseliem skaitliem");
        System.out.println("Darbību izvēle:");
        System.out.println("1 - +");
        System.out.println("2 - -");
        System.out.println("3 - *");
        System.out.println("4 - /");

        System.out.println("Skaitlitis:");
        int skaitlis1 = skeneris.nextInt();

        System.out.println("darbība:");
        int darbiba1 = skeneris.nextInt();

        System.out.println("atkal skaitlitis:");
        int skaitlis2 = skeneris.nextInt();

        System.out.println("otrā darbība:");
        int darbiba2 = skeneris.nextInt();

        System.out.println("pedejais skaitlis bla:");
        int skaitlis3 = skeneris.nextInt();

        if (darbiba1 == 1 && darbiba2 == 1) {
            System.out.println(skaitlis1 + skaitlis2 + skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 1 && darbiba2 == 2) {
            System.out.println(skaitlis1 + skaitlis2 - skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 1 && darbiba2 == 3) {
            System.out.println(skaitlis1 + (skaitlis2 * skaitlis3) + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 1 && darbiba2 == 4) {
            System.out.println(skaitlis1 + (skaitlis2 / skaitlis3) + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }


        if (darbiba1 == 2 && darbiba2 == 1) {
            System.out.println(skaitlis1 - skaitlis2 + skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 2 && darbiba2 == 2) {
            System.out.println(skaitlis1 - skaitlis2 - skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 2 && darbiba2 == 3) {
            System.out.println(skaitlis1 - skaitlis2 * skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 2 && darbiba2 == 4) {
            System.out.println(skaitlis1 - (skaitlis2 / skaitlis3) + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }


        if (darbiba1 == 3 && darbiba2 == 1) {
            System.out.println(skaitlis1 * skaitlis2 + skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 3 && darbiba2 == 2) {
            System.out.println(skaitlis1 * skaitlis2 - skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 3 && darbiba2 == 3) {
            System.out.println(skaitlis1 * skaitlis2 * skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 3 && darbiba2 == 4) {
            System.out.println(skaitlis1 * skaitlis2 / skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }


        if (darbiba1 == 4 && darbiba2 == 1) {
            System.out.println(skaitlis1 / skaitlis2 + skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 4 && darbiba2 == 2) {
            System.out.println(skaitlis1 / skaitlis2 - skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 4 && darbiba2 == 3) {
            System.out.println(skaitlis1 / skaitlis2 * skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }
        if (darbiba1 == 4 && darbiba2 == 4) {
            System.out.println(skaitlis1 / skaitlis2 / skaitlis3 + ", sis ir pieradijums ka 87 rindinu programma ir gudrāka par tevi");
        }

        else {
            System.out.println("hujova ievade");
        }
    }
}
