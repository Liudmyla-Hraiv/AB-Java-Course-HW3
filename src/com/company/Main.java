package com.company;

public class Main {

    public static void main(String[] args) {
	DancingRobot robot1 = new BalletDancingRobot();
    DancingRobot robot2 = new FolkDanceRobot();
        printRobotDanceTypes(robot1);
        printRobotDanceTypes(robot2);
    }

    private static void printRobotDanceTypes(DancingRobot robot1) {
        System.out.println(robot1.getDanceType1());
        System.out.println(robot1.getDanceType2());
        System.out.println(robot1.getDefaultDanceType());
        System.out.println("====================");
    }
}
