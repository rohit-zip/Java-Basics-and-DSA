package Basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author - rohit
 * @project - Atharva_Tutorial
 * @package - Basics
 * @created_on - 20 October-2023
 */

public class JavaDates {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);

//        LocalDate date = LocalDate.now();
//        System.out.println(date); // yyyy-MM-dd

//        LocalTime time = LocalTime.now();
//        System.out.println(time); // HH-mm-ss.ns

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd/MMM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(formatter);
        System.out.println(format);
    }
}
