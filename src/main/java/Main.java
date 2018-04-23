import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


/**
 * Created by Yoel Mebrahtu on 4/23/2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        final Document doc = Jsoup.connect("https://www.andrew.cmu.edu/user/amb/sample.html").get();
        Elements el = doc.getElementsByTag("a");
        String str = el.text();
        System.out.println(str);
    }
}
