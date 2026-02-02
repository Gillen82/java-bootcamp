public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * Function Name: greet
     * 
     * Inside the function:
     *  1. prints 'Hi'
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function Name: printText
     * @param name (String)
     * @param age (String)
     * 
     * Insdie function
     *  1. prints name and age as part of the text
     */
    public static void printText (String name, String age) {
        System.out.println("Hi, I'm " + name + " and I am " + age + " years old.");
    }

    /**
     * Function Name: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Insdie Function: 
     *  1. Calculate the area
     *  2. Return area as result
     */
    public static double calculateArea (double length, double width) {
        double area = length * width;
        return area;
    }
}
