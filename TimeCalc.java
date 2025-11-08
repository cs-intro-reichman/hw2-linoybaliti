public class TimeCalc {
    public static void main(String[] args) {
      

     int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
     int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
     int minAdd = Integer.parseInt(args[1]);
     int TotalMinutes = (hours*60) + minAdd + minutes;
     int Totalhours = TotalMinutes/60;
     int Newhours = Totalhours%24;
     int Newmin = TotalMinutes - (Totalhours*60);
 
    String newHoursStr = String.format("%02d", Newhours);   // "06"
    String newMinutesStr = String.format("%02d", Newmin); // "05"
    System.out.println(newHoursStr + ":" + newMinutesStr);
        
    }
}
