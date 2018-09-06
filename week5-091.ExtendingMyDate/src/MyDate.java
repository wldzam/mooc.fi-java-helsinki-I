
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate afterNumberOfDays(int days) {

        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return  newMyDate;

    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int getYear() {
        return year;
    }

    // method advances the date by one

    public void advance() {
        while (this.day <= 30) {
            this.day++;
            break;
        }
        if (this.day > 30) {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month=1;
                this.year++;
            }
        }
    }

    public void advance(int times) {
        for (int i = 0; i < times; i++) {
            advance();
        }
    }

//    public void advance(int numberOfDays) {
//        if (numberOfDays <= 30) {
//            int remained;
//            while (this.day + numberOfDays <= 30) {
//                this.day += numberOfDays;
//                break;
//            }
//            if (this.day + numberOfDays > 30) {
//                remained = 30 - this.day;
//                this.day = 0;
//                this.day = numberOfDays - remained;
//                if (this.month < 12) {
//                    this.month++;
//                } else {
//                    this.month=1;
//                    this.year++;
//                }
//            }
//        } else {
//            int numberOfMonth = numberOfDays / 30;
//            int daysRemained = numberOfDays - (30 * numberOfMonth);
//            int remainedInMonth = 0;
//            while (this.day + daysRemained <= 30) {
//                this.day += daysRemained;
//                break;
//            }
//            if (this.day + daysRemained > 30) {
//                remainedInMonth = 30 - this.day;
//                this.day = 0;
//                this.day = daysRemained - remainedInMonth;
//                if (this.month + numberOfMonth < 12) {
//                    this.month += numberOfMonth;
//                } else {
//                    int monthToAdd = 12 - this.month;
//                    this.month = monthToAdd + numberOfMonth;
//                    this.year++;
//                }
//            }
//        }
//    }
}
