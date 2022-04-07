package com.foobartory.business;

import com.foobartory.domain.Entrepots;
import com.foobartory.domain.ActionType;

public interface IAction {
	
	
	 Entrepots fooAction(Entrepots entrepots);
	
	 Entrepots barAction(Entrepots entrepots);
	
	 Entrepots assemblerAction(Entrepots entrepots);

	 Entrepots sellFooBarAction(Entrepots entrepots);
	
	 Entrepots buyRobotAction(Entrepots entrepots);
	
	 boolean assembleFoobarIsSuccess(int pourcentage);
	
     int getRandomTime();
    
     ActionType getActionType();
}
