package DSA.TCS_Interview;

import java.time.LocalDate;
import java.time.Period;

public class T18_FInd_Age {
    public static void main(String[] args) {
        int date=2;
        int month=7;
        int year=2003;
        LocalDate birth=LocalDate.of(year,month,date);
        LocalDate now=LocalDate.now();

        if(birth.isAfter(now)){
            System.out.println("Invalid birth date");
            return;
        }
            Period age=Period.between(birth,now);
            System.out.println("Age "+age.getYears()+" year, "+age.getMonths()+" months, "+age.getDays()+" days");
    }
}
