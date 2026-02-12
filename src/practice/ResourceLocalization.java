package practice;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceLocalization {
    public static void main(String[] args) {
        // ResourceBundle bundle = ResourceBundle.getBundle("resources.messages", Locale.of("hi", "IN"));

        // System.out.println(bundle.getString("Water"));

        ResourceBundle defaultBundle = ResourceBundle.getBundle("resources.messages");
        String pattern = defaultBundle.getString("Greeting");
        System.out.println(MessageFormat.format(pattern, "Kanan"));

    }
}
