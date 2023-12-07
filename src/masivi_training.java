//import java.util.Scanner;
//public class masivi_training {
//    public static void main(String[] args){
//
//        Scanner skeneris = new Scanner(System.in);
//        int[][] galdini = {{1, 2}, {2, 2}, {3, 4}, {4, 4}, {5, 6}, {6, 6}, {7, 8}, {8, 8}, {9, 10}, {10, 10}, {11, 12}};
//        int izvele;
//        do{
//
//        System.out.println("Iespējamās opcijas:");
//        System.out.println("1. Konkrēta galdiņa rezervācija.");
//        System.out.println("2. Grupas rezervācija.");
//        System.out.println("3. Beigt programmas darbību.");
//        System.out.println("4. Parādīt galdiņu brīvās vietas.");
//        System.out.println("Ievadiet darbības numuru:");
//
//        izvele = skeneris.nextInt();
//
//        if (izvele == 1) {
//            System.out.println("Ievadiet galdiņa numuru:");
//            int konkrets = skeneris.nextInt();
//            konkrets = konkrets - 1;
//            System.out.println("Cik liela ir Jūsu kompānija?");
//            int skaits = skeneris.nextInt();
//
//            if (galdini[konkrets][1] > skaits){
//                System.out.println("Jūsu kompānija ietilpst pie " + (konkrets + 1) + ". galdiņa. Varat ieņemt vietas.");
//                galdini[konkrets][1] = 0;
//            }
//            else {
//                System.out.println("Jūsu kompānija ir pārāk liela priekš " + (konkrets + 1) + ". galdiņa.");
//            }
//        }
//        if (izvele == 2) {
//            System.out.println("Ievadiet cilvēku skaitu:");
//            int lielagrupa = skeneris.nextInt();
//            int j = 10;
//            while (lielagrupa > galdini[j-1][1]) {
//                while (galdini[j][1] == 0){
//                    j = j - 1;
//                }
//                lielagrupa = lielagrupa - galdini[j][1];
//                System.out.println("Jums derēs " + (j + 1) + ". galdiņš (" + galdini[j][1] + " vietas).");
//                galdini[j][1] = 0;
//            }
//            int k = 0;
//            while (galdini[k][1] < lielagrupa){
//                k = k + 1;
//            }
//            System.out.println("Jums derēs " + (k + 1) + ". galdins (" + galdini[k][1] + " vietas).");
//            galdini[k][1] = 0;
//        }
//        if (izvele == 4){
//            System.out.println("Galdiņu brīvo vietu skaits:");
//            System.out.println("Pie 1. galdina ir " + galdini[0][1] + " brīvas vietas.");
//            System.out.println("Pie 2. galdina ir " + galdini[1][1] + " brīvas vietas.");
//            System.out.println("Pie 3. galdina ir " + galdini[2][1] + " brīvas vietas.");
//            System.out.println("Pie 4. galdina ir " + galdini[3][1] + " brīvas vietas.");
//            System.out.println("Pie 5. galdina ir " + galdini[4][1] + " brīvas vietas.");
//            System.out.println("Pie 6. galdina ir " + galdini[5][1] + " brīvas vietas.");
//            System.out.println("Pie 7. galdina ir " + galdini[6][1] + " brīvas vietas.");
//            System.out.println("Pie 8. galdina ir " + galdini[7][1] + " brīvas vietas.");
//            System.out.println("Pie 9. galdina ir " + galdini[8][1] + " brīvas vietas.");
//            System.out.println("Pie 10. galdina ir " + galdini[9][1] + " brīvas vietas.");
//            System.out.println("Pie 11. galdina ir " + galdini[10][1] + " brīvas vietas.");
//        }
//    } while (izvele == 1 || izvele == 2 || izvele == 4);
//}}
