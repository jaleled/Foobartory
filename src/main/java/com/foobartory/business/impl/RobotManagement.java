package com.foobartory.business.impl;

import com.foobartory.business.IRobotManagement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RobotManagement implements IRobotManagement {

	private int nbRobots;
    private List<Robot> robots;
    long start;



    public RobotManagement() {
    }

    public RobotManagement(int nbRobots, List<Robot> robots, long start) {
        this.nbRobots = nbRobots;
        this.robots = robots;
        this.start = start;
    }

    public RobotManagement(int nbRobots) {
        this.nbRobots = nbRobots;
        robots = new ArrayList<>();
    }
	@Override
	public void launchProductionLine() {
		  start = System.currentTimeMillis();
	      launchRobots();
	}

	@Override
	public void launchRobots() {
		 for (int i = 1; i <= nbRobots; i++) {
	            addRobotToProductionLine(i);
	        }
	}
	
	private void addRobotToProductionLine(int robotNumber) {
        Robot robot = new Robot(robotNumber, this);
            robots.add(robot);
            robot.start();

    }

	@Override
	public void buyAndAddRobot() {
		nbRobots++;
        ProductionLine.printBuyRobot(nbRobots);
        if (nbRobots < 30) {
            addRobotToProductionLine(nbRobots);
        } else {
            stopProductionLine();
        }
	}
	
	private void stopProductionLine() {
        stopRobots();
        ProductionLine.endOfProduction();
        System.exit(0);
    }

    private void stopRobots() {
        for (Robot robot : robots) {
            robot.interrupt();
        }
    }

}
