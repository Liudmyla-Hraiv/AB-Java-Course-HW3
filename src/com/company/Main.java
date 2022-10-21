package com.company;

public class Main {

    public static void main(String[] args) {

        printRobotDance(new BalletDancingRobot());
        printRobotDance(new FolkDanceRobot());
        printRobotDance(new JazzDancingRobot());
    }

    private static void printRobotDance(DancingRobot robot) {
        System.out.println("====================");
        System.out.println("Dance Type1: " + robot.getDanceType1());
        System.out.println("Dance Type2: " + robot.getDanceType2());
        System.out.println("Default Dance Type: " + robot.getDefaultDanceType());
        System.out.println("====================\n");
    }
}
