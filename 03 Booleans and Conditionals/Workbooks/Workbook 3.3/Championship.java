public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 50;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gryffindor take the House Cup!");
        } else if (margin >= 0) {
            System.out.println("In 2nd place... Gryffindor!");
        } else if (margin > -100) {
            System.out.println("In 3rd place... Gryffindor!");
        } else {
            System.out.println("In 4th place... Gryffindor!");
        }
        
    }
}
