package structural.facade.house;

import structural.facade.exception.FoundationException;

public class House {
    public void buildHouseAfterFoundation(Floor floor) throws FoundationException {
        if (floor.isFoundationPresent()) {
            System.out.println("The house is being built...");
        } else {
            throw new FoundationException("You cannot build house without foundation!!!");
        }
    }
}
