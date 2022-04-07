package com.foobartory.business.impl;


import com.foobartory.business.IAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductionLine {

    private static final Logger logger = LoggerFactory.getLogger(ProductionLine.class);


    private ProductionLine() {
    }

    public static void printAction(Robot robot, IAction action) {
        logger.debug(" robot  numéro : {}",robot.number);
        logger.debug(" tye d'action  : {}", action.getActionType());
    }
   
    

    public static void printAssembleFoobarResult(boolean isSuccess) {
        if (isSuccess) {
            logger.debug("Assemle Foobar SUCCESS");
        } else {
            logger.debug("Assemle Foobar FAILURE");
        }
    }

    public static void printBuyRobot(int nbRobots) {
        logger.debug(" action: {}",nbRobots);

    }

    public static void endOfProduction() {

        logger.debug("Fin de La Production");

    }

    public static void robotInterrupted(Robot robot) {
        logger.debug("Robot : {}  a été interrompu à la fin de son travail",robot.number);

    }
}