package String;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date11 {

    public static void main(String[] args) {

        Date date = new Date();
        //System.out.println(date);

        DateFormat dateformat = new SimpleDateFormat("DD/MM/YYYY");
        String currentDate = dateformat.format(date);

        System.out.println(currentDate);

        LocalTime time = LocalTime.now();
        //System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = formatter.format(time);

        System.out.println(currentTime);

    }
}
