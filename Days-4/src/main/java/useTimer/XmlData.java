package useTimer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.TimerTask;

public class XmlData extends TimerTask {

    @Override
    public void run() {
        ArrayList<Currency> ls = xmlResult();
        System.out.println( ls.get(0).getCurrencyName() );
    }

    public ArrayList<Currency> xmlResult() {
        String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
        ArrayList<Currency> ls = new ArrayList<>();
        try {
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().toString();
            Document doc = Jsoup.parse(stData, Parser.xmlParser());
            Elements elements = doc.getElementsByTag("Currency");
            for(Element item : elements) {
                String currencyName = item.getElementsByTag("CurrencyName").text();
                String forexBuying = item.getElementsByTag("ForexBuying").text();
                String forexSelling = item.getElementsByTag("ForexSelling").text();
                String banknoteBuying = item.getElementsByTag("BanknoteBuying").text();
                String banknoteSelling = item.getElementsByTag("BanknoteSelling").text();

                Currency c = new Currency(currencyName, forexBuying, forexSelling, banknoteBuying, banknoteSelling);
                ls.add(c);
            }
        }catch (Exception ex) {
            System.err.println("Xml Error :" + ex);
        }
        return ls;
    }

}
