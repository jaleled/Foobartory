package com.foobartory;
import com.foobartory.business.IRobotManagement;
import com.foobartory.business.impl.Robot;
import com.foobartory.business.impl.RobotManagement;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.*;

@SpringBootTest(classes = RobotManagement.class)
 class FoobartoryApplicationTests {

   private List<Robot> robots = new ArrayList();
   @Autowired
   private IRobotManagement robotManagement;



    @Test
    void buyAndAddRobotWhenNumberOfRobotLessThanTheerteenTest () {

        IRobotManagement robotManagement = new RobotManagement(2);

        robotManagement.buyAndAddRobot();
        addRobotToProductionLine(12);
        assertFalse(robots.isEmpty());

    }


    private void addRobotToProductionLine(int robotNumber) {
        Robot robot = new Robot(robotNumber,robotManagement);
        robots.add(robot);
    }

}

