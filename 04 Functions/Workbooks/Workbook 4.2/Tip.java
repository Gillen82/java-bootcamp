public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
    
        tipWaiter(bill);
    }

    public static void tipWaiter (double bill) {
        double tip = bill * 0.15;
        System.out.println("Your service was wonderfull. Please accet this tip: £" + tip);
    }
}