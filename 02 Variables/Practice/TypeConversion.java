public class TypeConversion {
    public static void main(String[] args) {
        int ants = 2000;
        int purchasedBlockOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlockOfCheese + " block(s) of cheese!");
        System.out.println("Each ant carries " + ((double)purchasedBlockOfCheese / ants) + " from the total amout of cheese");

        double salary = 2100.07;
        int roundedSalary = (int)salary;

        System.out.println("Mortgage Advisor: What is your salary in pounds? ");
        System.out.println("My monthly salary is: " + roundedSalary);
    }
}
