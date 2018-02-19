package behavioral.template;

public class BuildingRunner {
    public static void main(String[] args) {
        BuildingTemplate residentialBuilding = new ResidentialBuilding();
        BuildingTemplate officeBuilding = new OfficeBuilding();

        residentialBuilding.buildHouse();
        System.out.println("\n****************************************\n");
        officeBuilding.buildHouse();
    }
}
