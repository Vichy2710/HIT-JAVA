import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {
    public String Format(double x){
        NumberFormat nf= NumberFormat.getInstance(new Locale("en","US"));
        String val =nf.format(x);
        return val;
    }
}
