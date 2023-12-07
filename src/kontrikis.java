
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;
public class kontrikis {
    public static void main(String[] args) {

        try {
          //  FileWriter fails_1 = new FileWriter("teksts_1");
            //FileWriter fails_2 = new FileWriter("teksts_2");


        String pirma_faila_nosaukums = "teksts_1";
        File pirmais_fails = new File(pirma_faila_nosaukums);
        Scanner pirmais_skeneris = new Scanner(pirmais_fails);

        String otra_faila_nosaukums = "teksts_2";
        File otrais_fails = new File(otra_faila_nosaukums);
        Scanner otrais_skeneris = new Scanner(otrais_fails);

        String pareiza_atbilde = "OK";
        Scanner ievade = new Scanner(System.in);
        System.out.println("programma uztaisija 2 failus: fails_1 un fails_2.");
        System.out.println("Kad abos failos ievadīti salīdzināmie dati, ieraksti konsolē 'OK' ");
        String jabut_OK = ievade.nextLine();

        if (pareiza_atbilde.equals(jabut_OK)){

            String pirma_faila_rinda = "a";
            String otra_faila_rinda = "a";
            int rindas_nr = 0;

            while (pirma_faila_rinda.equals(otra_faila_rinda)){

                pirma_faila_rinda = pirmais_skeneris.nextLine();
                otra_faila_rinda = otrais_skeneris.nextLine();
                rindas_nr = rindas_nr + 1;
            }
            System.out.println(pirma_faila_rinda);
            System.out.println(otra_faila_rinda);
            System.out.println(rindas_nr);

            System.out.println("kļūda atrasta pirmā un otrā faila " + rindas_nr +
                    ". rindiņā. Pirmāja faila tā izskatās šādi ->" + pirma_faila_rinda +
                    ", bet otrā failā -> " + otra_faila_rinda + ".");

        }
        else {
            System.out.println("pašol nahui blaa dalbajob ti pidaras");
        }

    } catch (IOException e){
            System.out.println("kluda " + e);
        }
}}
