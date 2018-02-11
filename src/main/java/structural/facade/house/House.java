package structural.facade.house;

public class House {
    public void buildHouseAfterFoundation(Floor floor) {
        if (floor.isFoundationPresent()) {
            System.out.println("The house is being built...");
        } else {
            System.out.println("Waiting the foundation...");
        }
    }
}
