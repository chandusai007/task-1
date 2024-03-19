import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {

    public static void main(String[] args) {
        // Infinite loop to continuously display the current time
        while (true) {
            // Get the current time
            Date currentTime = new Date();

            // Format the time to display hours, minutes, and seconds
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            String formattedTime = timeFormat.format(currentTime);

            // Print the formatted time
            System.out.println(formattedTime);

            try {
                // Wait for 1 second before updating the time
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

