class Solution {
    public double angleClock(int hour, int minutes) {
        double minuteangle= 6*minutes;
        double hourangle=30*(hour%12)+(0.5 * minutes);
        double diff=Math.abs(minuteangle-hourangle);
        return Math.min(diff,360-diff);
    }
}