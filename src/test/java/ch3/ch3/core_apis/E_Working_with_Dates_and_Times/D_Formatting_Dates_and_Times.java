package ch3.ch3.core_apis.E_Working_with_Dates_and_Times;

/*
 * Created by: Cristian Arroyo
 * on 07 February 2018 - 4:50 PM
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.junit.Test;

public class D_Formatting_Dates_and_Times {

    @Test
    public void formatting_Dates_and_Times_1() {
        /* The date and time classes support many methods to get data out of them: */
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20
    }

    @Test
    public void formatting_Dates_and_Times_2() {
        /* Java provides a class called DateTimeFormatter to help us out. DateTimeFormatter can be used to format any type of date and/or time object*/
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE)); //2020-01-20
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); //11:12:34
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //2020-01-20T11:12:34
    }

    @Test
    public void formatting_Dates_and_Times_3() {
         /* This is a reasonable way for computers to communicate, but probably not how you want to output the date and time in your program. Luckily there are some predefi ned formats
        that are more useful: */
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        // System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        // System.out.println(shortDateTime.format(date)); // 1/20/20
        // System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
        //similar
        //DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //System.out.println(dateTime.format(shortDateTime2));
        //System.out.println(date.format(shortDateTime2));
        //System.out.println(time.format(shortDateTime2));
    }

    /*


    TABLE 3.5 ofLocalized methods
    _________________________________________________________________________________________________________________________________________________
    DateTimeFormatter f = DateTime
    Formatter._____(FormatStyle.SHORT);     Calling f.format(localDate)             Calling f.format(localDateTime)         Calling f.format(localTime)
    _________________________________________________________________________________________________________________________________________________

    ofLocalizedDate                         Legal – shows                           Legal – shows                           Throws runtime exception
                                            whole object                            just date part

    ofLocalizedDateTime                     Throws runtime exception                Legal – shows                           Throws runtime exception
                                                                                    whole object

    ofLocalizedTime                         Throws runtime exception                Legal – shows                           Legal – shows
                                                                                    just time part                          whole object
    _________________________________________________________________________________________________________________________________________________

     */

    @Test
    public void formatting_Dates_and_Times_4() {
        /*There are two predefi ned formats that can show up on the exam: SHORT and MEDIUM. The other predefi ned formats involve time zones */
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
    }

    @Test
    public void formatting_Dates_and_Times_5() {
        /*If you don’t want to use one of the predefi ned formats, you can create your own. For example, this code spells out the month*/
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        //System.out.println(dateTime.format(f)); // January 20, 2020, 11:12

        /*
        MMMM: M represents the month(M outputs 1, MM outputs 01, MMM outputs Jan, and MMMM outputs January)
        dd:   d represents the date in the month (dd means to include the leading zero for a single-digit month)
        yyyy: y represents the year (yy outputs a two-digit year and yyyy outputs a four-digit year)
        hh:   h represents the hour (Use hh to include the leading zero)
        : Use : if you want to output a colon
        mm:   m represents the minute
         */
    }

    @Test
    public void formatting_Dates_and_Times_6() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        // f.format(dateTime);
        // f.format(date); // throws exception
        // f.format(time);
        /*Remember M (uppercase) is month and m (lowercase) is minute.
        We can only use this formatter with objects containing times. Therefore, line 6 will throw
        an exception.*/
    }


}
