package structural.facade;

import structural.facade.exception.FoundationException;
import structural.facade.house.Floor;
import structural.facade.house.House;
import structural.facade.house.Roof;
import structural.facade.house.Wall;

public class BuildingProcess {
    private Floor floor = new Floor();
    private House house = new House();
    private Wall wall = new Wall();
    private Roof roof = new Roof();

    public void buildHouse() {
        floor.layFoundation();
        try {
            house.buildHouseAfterFoundation(floor);
            wall.buildWalls();
            roof.buildRoof();
            System.out.println("\nThe house is built!");
        } catch (FoundationException e) {
            e.printStackTrace();
        }
    }
}
