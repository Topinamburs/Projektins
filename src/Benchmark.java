import java.util.Scanner;
public class Benchmark {

    public static void main(String[] args) {

        Scanner skeneris = new Scanner(System.in);
        System.out.println("Cik mērījumu atkārtojumus veikt? Lielāks mērījumu skaits nodrošinās augstāku precizitāti un mazāku kļūdu un fona procesu efektu, tomēr paildzinās uzdevuma izpildes laiku un sildīs datoru.");
        int merijumu_skaits = skeneris.nextInt();
        System.out.println("Līdz cik skaitīt katrā mērījuma? Lielāki skaitļi padarīs procesu ilgāku un precīzāku (ieteicams 100000+), tomēr arī uzkarsēs datoru un izēdīs bateriju.");
        int max_skaitlis = skeneris.nextInt();
        int rezultats[][] = new int [21][2];
        
        int izdarito_merijumu_sk = 0;

        while(izdarito_merijumu_sk < merijumu_skaits){

        long startTime = System.currentTimeMillis();

        int a = 0;
        while(a < max_skaitlis){
            a = a + 1;
           System.out.println(a);
        }

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        int laiks = (int)elapsedTime;

        //System.out.println(laiks);
        
        rezultats[izdarito_merijumu_sk][0] = izdarito_merijumu_sk; 
        rezultats[izdarito_merijumu_sk][1] = laiks;
        izdarito_merijumu_sk = izdarito_merijumu_sk + 1;
    }
    int saskaitamo_sk = 0;
    int kopsumma = 0;

    while(saskaitamo_sk < merijumu_skaits){
       int summa = rezultats[saskaitamo_sk][1];
       kopsumma = kopsumma + summa;
       saskaitamo_sk = saskaitamo_sk + 1;
    }
    System.out.println("vidējais uzdevuma izpildes ilgums " + (kopsumma/merijumu_skaits) + " milisekundes. Tika veikti " + merijumu_skaits + " atkārtojumi");
}}
