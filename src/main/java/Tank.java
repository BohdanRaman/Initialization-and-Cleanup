/**
 * Create a class called Tank that can be filled and emptied, and has a
 * termination condition that it must be empty when the object is cleaned up. Write a
 * finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
 * that can occur when your Tank is used.
 */

public class Tank {

    boolean cleanUpTank = false;
    boolean fillingUpTank = true;

    public Tank(boolean cleanUpTank, boolean fillingUpTank) {
        this.cleanUpTank = cleanUpTank;
        this.fillingUpTank = fillingUpTank;
    }

    public void cleanUpTank() {
        cleanUpTank = false;
    }

    public void fillingUpTank() {
        fillingUpTank = true;
    }

    protected void finalize() {
        if (cleanUpTank)
            System.out.println("Error: clean up");
    else {
            System.out.println("Tank is full");
        }
        try {
            super.finalize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
