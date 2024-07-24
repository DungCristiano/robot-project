package robots;

// src/robots/Robot.java
public class Robot {
    private String id;
    private String name;

    public Robot(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void performTask() {
        System.out.println("Performing a generic task.");
    }
}
