public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.5, 2);
        double area2 = calculateArea(3.2, 1.3);
        double area3 = calculateArea(2, 2.8);
        System.out.println("Area 1: " + area1);
        System.out.println("Area 2: " + area2);
        System.out.println("Area 3: " + area3);

        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);

        String frenchExplanation = explainArea("French");
        System.out.println(frenchExplanation);

        String spanishExplanation = explainArea("Spanish");
        System.out.println(spanishExplanation);

        String italianExplanation = explainArea("Italian");
        System.out.println(italianExplanation);
        
    }
    public static double calculateArea(double width, double length) {
        if (width <= 0 || length <= 0) {
            System.out.println("Invalid value has been entered!");
            System.exit(0);
        }
        double area = width * length;
        return area;
    }

    public static String explainArea(String Language) {
        switch (Language) {
            case "English": return "Area equals length * width"; 
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }
    }
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"