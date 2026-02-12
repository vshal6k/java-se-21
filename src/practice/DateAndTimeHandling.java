package practice;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class DateAndTimeHandling {
    public static void main(String[] args) throws InterruptedException {

        // Instant startInstance = Instant.now();

        // LocalDateTime localDateTime = LocalDateTime.now();
        // LocalDate localDate = LocalDate.now();
        // LocalTime localtime = LocalTime.now();

        // // System.out.println(localDateTime);
        // // System.out.println(localDate);
        // // System.out.println(localtime);

        // localDate = LocalDate.of(2026, 2, 8);
        // localtime = LocalTime.of(0, 0);
        // localDateTime = LocalDateTime.of(localDate, localtime);

        // System.out.println(localDateTime);
        // System.out.println(localDate);
        // System.out.println(localtime);

        // // System.out.println(localDateTime.plusDays(1));
        // // System.out.println(localDate.minusMonths(1));
        // // System.out.println(localtime.plusHours(1));

        // System.out.println(localDateTime.getDayOfMonth());
        // System.out.println(localDate.getDayOfYear());
        // System.out.println(localtime.getMinute());

        // LocalDate kananBirthDate = LocalDate.of(2002, 11, 24);
        // LocalDate vishalBirthDate = LocalDate.of(2002, 6, 6);

        // if (vishalBirthDate.isBefore(kananBirthDate)) {
        // System.out.println("Vishal is older than Kanan.");
        // } else {
        // System.out.println("Kanan is older than Vishal");
        // }

        // Period birthdayGap = Period.between(vishalBirthDate, kananBirthDate);

        // System.out.println("Vishal is older than Kanan by " +
        // birthdayGap.toTotalMonths() + " months.");

        // // Thread.sleep(2000);

        // Instant endInstance = Instant.now();
        // Duration programDuration = Duration.between(startInstance, endInstance);
        // System.out.println("Program ran for " + programDuration.getSeconds() + "
        // seconds");

        // LocalDateTime localDateTime = LocalDateTime.now();

        // ZoneId localZoneId = ZoneId.systemDefault();
        // ZonedDateTime localZonedDateTime = ZonedDateTime.of(localDateTime,
        // localZoneId);
        // System.out.println(localZonedDateTime);

        // ZoneId sanFranciscoZoneId = ZoneId.of("GMT-8");
        // ZonedDateTime sanFranciscoTime =
        // localZonedDateTime.withZoneSameInstant(sanFranciscoZoneId);
        // System.out.println(sanFranciscoTime);

        // Locale indiaLocale = Locale.of("en", "IN");
        // Locale britishLocale = Locale.of("en", "GB");

        // int amount = 10023249;
        // Double discountPercentage = Double.valueOf(0.23);
        // BigDecimal price = new BigDecimal("23.44");

        // NumberFormat indiaCurrencyFormat =
        // NumberFormat.getCurrencyInstance(indiaLocale);
        // NumberFormat britishCurrencyFormat =
        // NumberFormat.getCurrencyInstance(britishLocale);
        // System.out.println(indiaCurrencyFormat.format(price));
        // System.out.println(britishCurrencyFormat.format(price));

        // NumberFormat indiaPercentFormat =
        // NumberFormat.getPercentInstance(indiaLocale);
        // NumberFormat britishPercentFormat =
        // NumberFormat.getPercentInstance(britishLocale);
        // System.out.println(indiaPercentFormat.format(discountPercentage));
        // System.out.println(britishPercentFormat.format(discountPercentage));

        // NumberFormat indiaNumberFormat = NumberFormat.getNumberInstance(indiaLocale);
        // NumberFormat britishNumberFormat =
        // NumberFormat.getNumberInstance(britishLocale);
        // System.out.println(indiaNumberFormat.format(amount));
        // System.out.println(britishNumberFormat.format(amount));

        // try {
        // Double d = (Double) britishCurrencyFormat.parse("£23.44");
        // BigDecimal p = BigDecimal.valueOf((Double)britishPercentFormat.parse("23%"));
        // int a = indiaNumberFormat.parse("10,023,249").intValue();
        // System.out.println(d);
        // System.out.println(p);
        // System.out.println(a);
        // } catch (ParseException e) {
        // e.printStackTrace();
        // }

        // System.out.println(
        //         DateTimeFormatter.ofPattern("dd-MM-yy EEEE HH:mm:ss XXX", Locale.ITALY).format(ZonedDateTime.now()));

        // DateTimeFormatter dtf =
        // DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        // System.out.println(dtf.format(ZonedDateTime.now()));
        
    }
}
