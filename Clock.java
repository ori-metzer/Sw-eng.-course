public class Clock {
    private int hour;
    private int minute;
    private static final int MAX_HOUR = 23;
    private static final int MIN_HOUR = 0;
    private static final int MAX_MINUTE = 59;
    private static final int MIN_MINUTE = 0;
    private static final int DEFAULT_VALUE = 0;

    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }


    public boolean inRange(int num, int lowerBound, int upperBound) {
        return num >= lowerBound && num <= upperBound;
    }

    /**
     *
     * shows the hour of the clock
     * @return this function shows the hour of the clock
     */
    public int getHour() { return hour; }

    /**
     * sets the hour of the clock after checking the range
     * @param hour integer represents of the hours
     */
    public void setHour(int hour) {
        if (!(inRange(hour,MIN_HOUR,MAX_HOUR))){
            this.hour=DEFAULT_VALUE;
        }
        else{ this.hour = hour; }
    }

    /**
     * shows the minutes of the clock
     * @return this function shows the minutes of the clock
     */
    public int getMinute() { return minute; }

    /**
     * sets the minutes of the clock after checking the range
     * @param minute integer represents of the minutes
     */
    public void setMinute(int minute) {
        if (!(inRange(minute,MIN_MINUTE,MAX_MINUTE))){
            this.minute=DEFAULT_VALUE;
        }
        else{ this.minute = minute; }
    }


    /**
     * compares the current clock with a given object
     * @param other is another object to compare with
     * @return true only if the given object is also Clock and if hashcode, minutes and hours will be the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clock)) {
            return false;
        }
        Clock otherClock = (Clock) other;
        return this.hour == otherClock.hour && this.minute == otherClock.minute && this.hashCode() == otherClock.hashCode();
    }

    /**
     * returns hashcode calculation fits to the amount of minutes in the correct range
     * @return hashcode calculation fits to the amount of minutes in the correct range
     */
    @Override
    public int hashCode() {
        return 60 * hour + minute;
    }

    /**
     * returns string that shows the time after checking cases
     * @return string that shows the time after checking cases
     */
    @Override
    public String toString() {
        if (hour<=9 && minute<=9){
            return "0"+hour+":"+"0"+minute;
        }
        else if (hour<=9){
            return "0"+hour+":"+minute;
        }
        else if (minute<=9){
            return hour+":"+"0"+minute;
        }
        else {
            return hour+":"+minute;
        }
    }

    
}
