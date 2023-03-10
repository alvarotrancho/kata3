package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
    
}
