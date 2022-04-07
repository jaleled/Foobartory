package com.foobartory;



import com.foobartory.business.IRobotManagement;
import com.foobartory.business.impl.Robot;
import com.foobartory.business.impl.RobotManagement;


public class FoobartoryApplication {

	public static void main(String[] args) {
		
		
		IRobotManagement robotManagement = new RobotManagement(2);
		Robot robot = new Robot(2,robotManagement);
		robot.start();
		
	}

}
