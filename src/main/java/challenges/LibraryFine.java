package challenges;

import java.time.LocalDate;
import java.time.Period;

//https://www.hackerrank.com/challenges/library-fine/problem
public class LibraryFine {

    public static void main(String[] args) {
        System.out.println(libraryFine(11, 9, 2019, 23, 11, 2019));
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
        System.out.println(libraryFine(6, 6, 2015, 9, 6, 2015));
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1014));
        System.out.println(libraryFine(2, 7, 2015, 1, 2, 2014));
        System.out.println(libraryFine(5, 5, 2014, 23, 2, 2014));
        System.out.println(libraryFine(1, 1, 2014, 31, 12, 2015));
    }

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 10000;
        }
        if (y1 == y2 && m1 > m2) {
            return (m1 - m2) * 500;
        }
        if (y1 == y2 && m1 == m2 && d1 > d2) {
            return (d1 - d2) * 15;
        }
        return 0;
    }

    private static int libraryFineRealMy(int d1, int m1, int y1, int d2, int m2, int y2) {

        LocalDate end = LocalDate.of(y1, m1, d1);
        LocalDate star = LocalDate.of(y2, m2, d2);
        Period period = Period.between(star, end);
        if (period.isNegative()) {
            return 0;
        }
        int diffYear = period.getYears();
        int diffMonths = period.getMonths();
        int diffDay = period.getDays();
        if (diffYear >= 1) {
            return 10000;
        } else if (diffMonths < 1)
            return diffDay * 15;
        else {
            return (diffMonths * 500) + (diffDay * 15);
        }
    }
}