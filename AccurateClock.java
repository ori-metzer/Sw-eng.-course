
public class AccurateClock extends Clock {

    private int seconds;
    private static final int MIN_SECOND = 0;
    private static final int MAX_SECOND = 59;
    private static final int DEFAULT_VALUE = 0;

    public AccurateClock(int hour, int minute, int seconds) {
        super(hour, minute);
        setSeconds(seconds);
    }


    @Override
    public int getHour() {
        return super.getHour();
    }

    @Override
    public int getMinute() {
        return super.getMinute();
    }


    /**
     *  this function set the seconds of the clock after checking the range
     * @param seconds integer represents of the seconds
     */
    public void setSeconds(int seconds) {
        if (!(inRange(seconds,MIN_SECOND,MAX_SECOND))){
            this.seconds=DEFAULT_VALUE;
        }
        else{ this.seconds = seconds; }
    }

    /**
     * this function compares the current Accurate clock with a given object
     * @param other is another object to compare with
     * @return true only if the given object is also accurateClock and if seconds, minutes and hours will be the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccurateClock)) {
            return false;
        }
        AccurateClock otherClock = (AccurateClock) other;
        return this.getHour() == otherClock.getHour() && this.getMinute() == otherClock.getMinute() && this.seconds == otherClock.seconds;
    }

    /**
     * this function returns hashcode calculation fits to the amount of seconds in the correct range
     * @return hashcode calculation fits to the amount of seconds in the correct range
     */
    @Override
    public int hashCode() {
        return 60*60*getHour()+60*getMinute()+seconds;
    }

    /**
     * this function returns string that shows the time after checking cases
     * @return string that shows the time after checking cases
     */
    @Override
    public String toString() {
        if (getHour()<=9 && getMinute()<=9 && seconds<=9){
            return super.toString()+":0"+seconds;
        }
        else if (getMinute()<=9 && seconds<=9){
            return super.toString()+":0"+seconds;
        }
        else if (getHour()<=9 && seconds<=9){
            return super.toString()+":0"+seconds;
        }
        else if(getHour()<=9 && getMinute()<=9){
            return super.toString()+":"+seconds;
        }
        else if(getHour()<=9){
            return super.toString()+":"+seconds;
        }
        else if(getMinute()<=9){
            return super.toString()+":"+seconds;
        }
        else if (seconds<=9){
            return super.toString()+":0"+seconds;
        }
        else{
            return super.toString()+":"+seconds;
        }
    }
}
