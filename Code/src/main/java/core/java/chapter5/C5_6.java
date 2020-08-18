package core.java.chapter5;

/**
 * @author: huakaimay
 * @since: 2020-08-18
 */
public enum C5_6 {

    /**
     * 小码
     */
    SMALL("S"),
    /**
     * 中号
     */
    MEDIUM("M"),
    /**
     * 大码
     */
    LARGE("L"),
    /**
     * 超大码
     */
    EXTRA_LARGE("XL");

    private String abbreviation;

    C5_6(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static void main(String[] args) {
        C5_6 small = C5_6.SMALL;
        System.out.println(small);
        String s = C5_6.SMALL.toString();
        System.out.println(s);

        int ordinal = C5_6.SMALL.ordinal();
        System.out.println(ordinal);

        String abbreviation = C5_6.SMALL.getAbbreviation();
        System.out.println(abbreviation);
    }
}
