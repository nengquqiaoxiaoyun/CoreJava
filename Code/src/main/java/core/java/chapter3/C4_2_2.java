package core.java.chapter3;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author: huakaimay
 * @since: 2020-07-28
 */
public class C4_2_2 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        /*
        格式化日期
         */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);

        /*
         给日期加上指定天数
         */
        LocalDate localDate = LocalDate.of(2019, 11, 3).plusDays(365);
        System.out.println(localDate);


    }
}
