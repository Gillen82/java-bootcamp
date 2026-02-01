public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "snowy";

        switch (weather) {
            case "sunny": 
                System.out.println("You should wear a t-shirt");
                break;
            case "cloudy": 
                System.out.println("You should wear a jumper");
                break;
            case "rainy": 
                System.out.println("You should wear a raincoat");
                break;
            case "snowy": 
                System.out.println("You should wear a hat, scarf, and gloves");
                break;
            default:
                System.out.println("You can wear whatever you want");
        }

        // Section 2: User role
        int role = 4;

        switch (role) {
            case 1:
                System.out.println("You are an Admin");
                break;
            case 2:
                System.out.println("You are an Editor");
                break;
            case 3:
                System.out.println("You are a User");
                break;
            default:
                System.out.println("You don't own an account");
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if (temperature > 25 && humidity > 60) {
            System.out.println("It's too hot and humid!\n");
        } else if (temperature > 25) {
            System.out.println("It's too hot\n");
        } else if (temperature < 15 && humidity > 60) {
            System.out.println("It's too cold and humid\n");
        } else if (temperature < 15) {
            System.out.println("It's too cold");
        } else {
            System.out.println("The working conditions are ideal");
        }

        // Section 4: Age and income
        int age = 25;
        int income = 50000;

        if (age >= 18 && age < 60 && income >= 30000) {
            System.out.println("You are eligable for a credit card");
        } else {
            System.out.println("You are not eligable for a credit card");
        }

        // Section 1: Traffic light colors
        String lightColor = "red";

        switch (lightColor) {
            case "green":
                System.out.println("You can drive through lights");
                break;
            case "yellow":
                System.out.println("Slow down and prepare to stop");
                break;
            case "red":
                System.out.println("Stop! Do not pass through the lights");
            default:
                System.out.println("You are not the driver!!");
                break;
        }

        // Section 2: Exam grade
        int grade = 85;

        if (grade > 90) {
            System.out.println("You passed with an A");
        } else if (grade > 85) {
            System.out.println("You passed with a B");
        } else if (grade > 80) {
            System.out.println("You passed with a C");
        } else if (grade > 75) {
            System.out.println("You failed with a D");
        } else {
            System.out.println("You did not complete the test!");
        }
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Opera";

        switch (browser) {
            case "Chrome": System.out.println("You are using Chrome"); break;
            case "Firefox": System.out.println("You are using Firefox"); break;
            case "Edge": System.out.println("You are using Edge"); break;
            case "Safari": System.out.println("You are using Safari"); break;
            case "Opera": System.out.println("You are using Opera"); break;
            default: System.out.println("Yo are not using a mainstream Browser!");
        }
    }
}
