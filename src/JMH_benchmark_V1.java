import org.openjdk.jmh.annotations.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;

    public class JMH_benchmark_V1 {
    private static final int ITERATIONS = 100000000;

    public static void main(String[] args){
        long start_time = System.currentTimeMillis();

        // for (int i = 0; i < ITERATIONS; i++){
        //     double rezultats = Math.pow(i, 3);
        // }
        File biblioteka = new File("bibliotekas_fails.csv");

        try{
            FileWriter uz_biblioteku = new FileWriter("bibliotekas_fails.csv");
        } catch(FileNotFoundException e){
            System.out.println("fails nav atrasts");
        } catch (IOException a){
            System.out.println(a);
        }
           
            

        long end_time = System.currentTimeMillis();

        long izpildes_laiks = end_time - start_time;

        System.out.println(izpildes_laiks + " milisekundes");
    }

    }
