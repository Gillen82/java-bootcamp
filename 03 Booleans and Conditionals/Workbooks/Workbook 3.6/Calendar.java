public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Monday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");
        System.out.println("Hmm, let me check my calendar.");
        
        //Check 'calendar' here:
        switch (day) {
            case "Monday": System.out.println("Sorry... I have to work late."); break;
            case "Tuesday": System.out.println("I have meetings all day."); break;
            case "Wednesday": System.out.println("I have a dentist appointment. Maybe another day?"); break;
            case "Thursday": System.out.println("Date night tonight."); break;
            default: System.out.println("I'm free!");
        }        
    }
}
