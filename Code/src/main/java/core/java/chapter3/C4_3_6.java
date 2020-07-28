package core.java.chapter3;

import java.util.Date;

/**
 * @author: huakaimay
 * @since: 2020-07-28
 */
public class C4_3_6 {

    private Date hireDay;

    public C4_3_6(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }


    public Date getHireDay() {
        return hireDay;
    }

    @Override
    public String toString() {
        return "C4_3_6{" +
                "hireDay=" + hireDay +
                '}';
    }

    public static void main(String[] args) {
        C4_3_6 c4_3_6 = new C4_3_6(new Date());
        Date d = c4_3_6.getHireDay();
        double tenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        d.setTime(d.getTime() - (long) tenYearsInMilliSeconds);

        System.out.println(c4_3_6);
    }
}
