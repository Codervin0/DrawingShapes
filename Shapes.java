public class Shapes {
    public static void main(String[] args) {
    
    int turtleMoves = 0;

Turtle lenny = new Turtle();

            for (int i = 0; i < 9 ; i++) {
            lenny.forward(50);
            lenny.left(160);
            turtleMoves++;
            }
   
    lenny.right(180);
    turtleMoves++;
    lenny.forward(60);
    lenny.right(270);
    turtleMoves++;
 
    for (int j = 0; j < 10 ; j++) {
        lenny.left(36);
        lenny.forward(80);
            for (int i = 0; i < 9 ; i++) {
            lenny.forward(50);
            lenny.left(160);
            turtleMoves++;
            }
    }    
        System.out.println("The Turtle moved " + turtleMoves + " times!");
        
        // Task 1: Draw a regular shape

        // Task 2: Draw a regular shape many times

        // Task 3: How many times does Turtle turn!
   
        // Extension 1:

        // Extension 2:

    }
}

