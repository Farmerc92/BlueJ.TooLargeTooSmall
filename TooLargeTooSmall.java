
/**
 * Compares guess to seed.  If the guess is the same as the seed it returns a 0.  If it is less than the seed, 
 * this it is -1.  If it is more than the seed, then it is 1.  
 *
 * @author Chris Farmer
 * @version Version 1.1
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        if (g.compareTo(chosenNum) == 0){
            return 0;
        }
        else if (g.compareTo(chosenNum) < 0) {
            return -1;
        }
        else {
            return 1;
        }
        

    }
}