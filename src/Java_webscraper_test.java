import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Java_webscraper_test {

    public static void main(String[] args) {
        String url = "https://www.rimi.lv/e-veikals/lv/produkti/augli-un-darzeni/augli-un-ogas/aboli-un-bumbieri/aboli-golden-delicious-80-90-mm-1-sk-kg/p/297240";

        try {

           Document teksts = Jsoup.connect(url).get();

            for(Element row : teksts.select("div.price"))
            {
                String rindina = 
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
