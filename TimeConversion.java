 public static String timeConversion(String s) {
    // Write your code here
        char zone = s.charAt(s.length()-2);
        String timePart = s.substring(0,s.length()-2);
        String[] divisions = timePart.split(":");
        
        String hours = divisions[0];
        String minutes = divisions[1];
        String seconds = divisions[2];
        
        int hour = (hours.charAt(0)-'0')*10+(hours.charAt(1)-'0');
        int minute = (minutes.charAt(0)-'0')*10 + (minutes.charAt(1)-'0');
        int second = (seconds.charAt(0)-'0')*10 + (seconds.charAt(1)-'0');
        
        if(zone=='P' && hour!=12){
            hour+=12;
        }
        else if(zone=='A' && hour == 12){
            hour = 0;
        }
        String result = String.format("%02d:%02d:%02d",hour,minute,second);
        return result;
    }

}
