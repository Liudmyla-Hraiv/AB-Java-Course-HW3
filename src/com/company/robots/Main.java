package com.company.robots;

import com.company.robots.BalletDancingRobot;
import com.company.robots.DancingRobot;
import com.company.robots.FolkDanceRobot;
import com.company.robots.JazzDancingRobot;

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
