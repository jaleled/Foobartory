package com.foobartory;



import com.foobartory.business.IRobotManagement;
import com.foobartory.business.impl.Robot;
import com.foobartory.business.impl.RobotManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FoobartoryApplication {




	public static void main(String[] args) {
		SpringApplication.run(FoobartoryApplication.class, args);

		IRobotManagement robotManagement = new RobotManagement(2);
		Robot robot = new Robot(2,robotManagement);
		robot.start();

	}




}
