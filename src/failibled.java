import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class failibled {
    public static void main(String[] args){

        Scanner skeneris = new Scanner(System.in);
        System.out.println("Izvēlieties darbību...");
        System.out.println("ievadīt jaunu kontaktu - 1");
        System.out.println("Atrast jau esošu kontaktu - 2");
        int izvele = skeneris.nextInt();

        if (izvele == 1){

        try{
        FileWriter rakstitajs = new FileWriter("fails", true);

        Scanner lietotajs = new Scanner(System.in);
        System.out.println("Ievadiet cilvēka vārdu, uzvārdu un tālruņa nummuru....");
        String ievade = lietotajs.nextLine();
        rakstitajs.append(ievade + "\n");
        rakstitajs.close();

    } catch (IOException e){
            System.out.println("kļūda" + e);
        }
        }
        else{
            try {

                Scanner izvele2 = new Scanner(System.in);
                System.out.println("izvēlieties meklēšanas ceļu....");
                System.out.println("ar vārdu - 1");
                System.out.println("ar uzvārdu - 2");
                System.out.println("ar numuru - 3");
                int ievade2 = izvele2.nextInt();

                String failanosaukums = "fails";
                File saraksts = new File(failanosaukums);

                Scanner lasitajs = new Scanner(saraksts);

            if (ievade2 == 1){

                Scanner vards = new Scanner(System.in);
                System.out.println("ievadiet vardu...");
                String ievaditais_vards = vards.nextLine();

                int rindasnr = 1;
                String rindina = null;
                String[] sadalits = {"1212","12121","dsdad" };

                while (!sadalits[0].equals(ievaditais_vards)){
                    rindina = lasitajs.nextLine();
                   // System.out.println(rindina);
                    sadalits = rindina.split(" ");
                    rindasnr = rindasnr + 1;
                }
                System.out.println(rindina);
            }
                if (ievade2 == 2){

                    Scanner uzvards = new Scanner(System.in);
                    System.out.println("ievadiet uzvardu...");
                    String ievaditais_uzvards = uzvards.nextLine();

                    int rindasnr = 1;
                    String rindina = null;
                    String[] sadalits = {"1212","12121","dsdad" };

                    while (!sadalits[1].equals(ievaditais_uzvards)){
                        rindina = lasitajs.nextLine();
                        // System.out.println(rindina);
                        sadalits = rindina.split(" ");
                        rindasnr = rindasnr + 1;
                    }
                    System.out.println(rindina);
                }
                if (ievade2 == 3){

                    Scanner numurs = new Scanner(System.in);
                    System.out.println("ievadiet numuru...");
                    String ievaditais_numurs = numurs.nextLine();

                    int rindasnr = 1;
                    String rindina = null;
                    String[] sadalits = {"1212","12121","dsdad" };

                    while (!sadalits[2].equals(ievaditais_numurs)){
                        rindina = lasitajs.nextLine();
                        // System.out.println(rindina);
                        sadalits = rindina.split(" ");
                        rindasnr = rindasnr + 1;
                    }
                    System.out.println(rindina);

                }
            } catch (IOException e){
                System.out.println("kluda " + e);
            }
        }}}
