class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hours   = Integer.parseInt(startTime.substring(0, 2));  
        int minutes = Integer.parseInt(startTime.substring(3, 5));  
        int seconds = Integer.parseInt(startTime.substring(6, 8));  
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        int shours   = Integer.parseInt(endTime.substring(0, 2));  
        int sminutes = Integer.parseInt(endTime.substring(3, 5));  
        int sseconds = Integer.parseInt(endTime.substring(6, 8));  
        int stotalSeconds = shours * 3600 + sminutes * 60 + sseconds;
        return Math.abs(totalSeconds-stotalSeconds);
    }
}