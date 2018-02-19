package behavioral.template;

public abstract class BuildingTemplate {
    public void buildHouse() {
        System.out.println("Laying foundation...");
        System.out.println("Building walls...");
        System.out.println(buildRooms().toUpperCase());
        System.out.println("Building roof...");
    }

    public abstract String buildRooms();
}
