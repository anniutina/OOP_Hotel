package hotel;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class ReservationPeriod implements PeriodInterface {

    private LocalDate inDate, outDate;
    ArrayList<LocalDate> period = new ArrayList<>();

    public ReservationPeriod(int y1, int m1, int d1, int y2, int m2, int d2){
        this.inDate = LocalDate.of(y1, m1, d1);
        this.outDate = LocalDate.of(y2, m2, d2);;
    }

    @Override
    public ArrayList<LocalDate> getPeriod() {
        period.add(inDate);
        period.add(outDate);
        return period;
    }

    public long getDays(){
        Period p = Period.between(inDate, outDate);
        long p2 = ChronoUnit.DAYS.between(inDate, outDate);
        return p2;
    }
}
