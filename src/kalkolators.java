import java.util.Scanner;
public class kalkolators {
    public static void main(String[] args){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("izvēlieties darbību:");
        System.out.println("1 - +");
        System.out.println("2 - -");
        System.out.println("3 - *");
        System.out.println("4 - /");
        int izvele = skeneris.nextInt();


        if (izvele == 1) {
            System.out.println("nemaki saskaitīt?");
            System.out.println("pirmais skaitlis:");
            int pirmaissk = skeneris.nextInt();
            System.out.println("otrais skaitlis, ambali:");
            int otraissk = skeneris.nextInt();
            System.out.println(pirmaissk + otraissk + ", dauni");
        }
        if (izvele == 2)  {
            System.out.println("nabagam nav ko atnemt haha");
            System.out.println("pirmais skaitlis:");
            int pirmaissk = skeneris.nextInt();
            System.out.println("otrais skaitlis, ambali:");
            int otraissk = skeneris.nextInt();
            System.out.println(pirmaissk - otraissk + ", dauni");

        }
        if (izvele == 3)  {
            System.out.println("saskaitisana +pro-ultra mode ieslegts");
            System.out.println("pirmais skaitlis:");
            int pirmaissk = skeneris.nextInt();
            System.out.println("otrais skaitlis, ambali:");
            int otraissk = skeneris.nextInt();
            System.out.println(pirmaissk * otraissk + ", dauni");
        }
        if (izvele == 4)  {
            System.out.println("tu labak koncas klasei izdali nahui");
            System.out.println("pirmais skaitlis:");
            int pirmaissk = skeneris.nextInt();
            System.out.println("otrais skaitlis, ambali:");
            int otraissk = skeneris.nextInt();
            System.out.println(pirmaissk / otraissk + ", dauni");
        }
        else {
            System.out.println("ble tev ir jautri, ka nahui lasit nemaki dauni. pirms matematikas latviesu valoda maybe aizej, idiot");
        }
    }
}
