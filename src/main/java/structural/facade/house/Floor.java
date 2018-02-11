package structural.facade.house;

public class Floor {
    private boolean foundationPresent;

    public boolean isFoundationPresent() {
        return foundationPresent;
    }

    public void layFoundation() {
        System.out.println("Lay the foundation...");
        foundationPresent = true;
    }

    public void planFoundation() {
        System.out.println("Planning foundation...");
        foundationPresent = false;
    }
}
