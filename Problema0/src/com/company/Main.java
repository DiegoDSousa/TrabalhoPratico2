package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Robot MyRobot=new Robot('o');

        MyRobot.getLocation();
        MyRobot.getDirection();
        MyRobot.turnLeft();
        MyRobot.getDirection();
        MyRobot.turnRight();
        MyRobot.getDirection();
        MyRobot.turnRight();
        MyRobot.getDirection();
        MyRobot.turnRight();
        MyRobot.getDirection();
        MyRobot.move();
        MyRobot.move();
        MyRobot.showLocation(MyRobot.getLocation());
        MyRobot.turnRight();
        MyRobot.getDirection();
        MyRobot.move();
        MyRobot.showLocation(MyRobot.getLocation());


    }
}
