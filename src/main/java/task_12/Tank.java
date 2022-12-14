package task_12;

/**
 * Create a class called Tank that can be filled and emptied, and has a
 * termination condition that it must be empty when the object is cleaned up. Write a
 * finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
 * that can occur when your Tank is used.
 */

public class Tank {

    private boolean cleanUpTank;
    private boolean fillingUpTank;

    public boolean isCleanUpTank() {
        return cleanUpTank;
    }

    public void setCleanUpTank(boolean cleanUpTank) {
        this.cleanUpTank = cleanUpTank;
    }

    public boolean isFillingUpTank() {
        return fillingUpTank;
    }

    public void setFillingUpTank(boolean fillingUpTank) {
        this.fillingUpTank = fillingUpTank;
    }

    public Tank(boolean cleanUpTank, boolean fillingUpTank) {
        this.cleanUpTank = cleanUpTank;
        this.fillingUpTank = fillingUpTank;
    }

    public void cleanUpTank() {
        if (cleanUpTank) {
            System.out.println("Error: clean up");
        }
    }

    public void fillingUpTank() {
        if (fillingUpTank) {
            System.out.println("Tank is full");
        }
    }

    public void finalize() {
        if (cleanUpTank)
            System.out.println("Tank clean up");
    }
}
