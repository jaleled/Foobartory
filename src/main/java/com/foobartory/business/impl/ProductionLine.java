package com.foobartory.business.impl;


import com.foobartory.business.IAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductionLine {

    private ProductionLine() {
    }

    private static final Logger logger = LoggerFactory.getLogger(ProductionLine.class);




    public static   void printAction(Robot robot, IAction action) {
        logger.debug(" robot  number  : {}  do action :{} ",robot.number,action.getActionType() );
    }
   
    

    public static  void printAssembleFoobarResult(boolean isSuccess) {
        if (isSuccess) {
            logger.debug("Assemle Foobar SUCCESS");
        } else {
            logger.debug("Assemle Foobar FAILURE");
        }
    }

    public static  void printBuyRobot(int nbRobots) {
        logger.debug(": {} Robot bought",nbRobots);

    }

    public static  void endOfProduction() {

        logger.debug("End Of production");

    }

    public static  void robotInterrupted(Robot robot) {
        logger.debug("Robot : {}  interrupted His Work",robot.number);

    }
}