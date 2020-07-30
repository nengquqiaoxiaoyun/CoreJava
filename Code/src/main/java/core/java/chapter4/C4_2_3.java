package core.java.chapter4;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;


/**
 * @author: huakaimay
 * @since: 2020-07-28
 */
public class C4_2_3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int monthValue = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        System.out.println(monthValue);
        System.out.println(dayOfMonth);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        /*
        月初及它是周几
         */
        date = date.minusDays(dayOfMonth - 1);
        System.out.println(date);
        DayOfWeek dayOfWeek1 = date.getDayOfWeek();
        System.out.println(dayOfWeek1);


    }

    /**
     * 打印当前月份的日历
     * 如果是当前日就用*标记
     * 每一周换行打印
     */
    @Test
    public void test() {
        LocalDate date = LocalDate.now();

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        // 回到月初
        date = date.minusDays(today - 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();

        System.out.println("周一 周二 周三 周四 周五 周六 周日");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }


        // 还在当前月份
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());

            if(date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            // 每次加一天
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }


    }
}
