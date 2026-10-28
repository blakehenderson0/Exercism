class Leap {

    boolean isLeapYear(int year) {

        boolean LeapYear = year%4 == 0;

        if (LeapYear == true) {

            switch (year%100) {
                case 0:
                    if (year%400 == 0) {
                        LeapYear = true;
                    } else
                        LeapYear = false;
            }
        } else {
            LeapYear = false;
        }
        return LeapYear;
    }
}
