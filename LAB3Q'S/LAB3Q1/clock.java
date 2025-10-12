import java.util.Calendar;

public class clock { 
    public static void main(String[] args) {
        // Get current time from system
        Calendar cal = Calendar.getInstance();
        
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));

        int startMinute = t.getMinute();       
        // Loop until the minute changes
        while (t.getMinute() == startMinute) {
            
            long startMillis = System.currentTimeMillis();
            t.tick(); 
            
            System.out.println(t); 
            while (System.currentTimeMillis() - startMillis < 1000) {

            }
        }
        
        System.out.println("Minute has advanced. Program terminated.");
    }
}
    

