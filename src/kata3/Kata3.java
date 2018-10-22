package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("gmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("hotmail.com");
        histo.increment("yahoo.com");
        histo.increment("yahoo.com");
        histo.increment("yahoo.com");
        histo.increment("ulpgc.es");
        
        new HistogramDisplay(histo).execute();

    }
    
}
