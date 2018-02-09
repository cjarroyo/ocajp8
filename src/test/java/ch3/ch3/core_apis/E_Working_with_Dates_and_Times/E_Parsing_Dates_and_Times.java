package ch3.ch3.core_apis.E_Working_with_Dates_and_Times;

/*
 * Created by: Cristian Arroyo
 * on 07 February 2018 - 4:51 PM
 */

public class E_Parsing_Dates_and_Times {
    /* you’ll fi nd it easy to convert a String to a date or time*/
    /* Just like the format() method, the parse() method takes a formatter as well. If you don’t specify one, it uses the default for that type. */

    DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date = LocalDate.parse("01 02 2015", f);
    LocalTime time = LocalTime.parse("11:22");
    System.out.println(date); // 2015-01-02
    System.out.println(time); // 11:22

}
