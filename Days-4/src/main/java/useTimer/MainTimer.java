package useTimer;

import java.util.ArrayList;
import java.util.Timer;

public class MainTimer {

    public static void main(String[] args) {

        XmlData xmlData = new XmlData();
        //Timer timer = new Timer();
        //timer.schedule(xmlData, 1000 * 5, 1000 * 5);
        ArrayList<Currency> ls = xmlData.xmlResult();
        System.out.println( ls.get(0).toString() );
        for( Currency item : ls ) {
            System.out.println(item);
        }

    }

}
