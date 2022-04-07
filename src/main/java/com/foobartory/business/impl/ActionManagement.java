package com.foobartory.business.impl;

import com.foobartory.business.IAction;
import com.foobartory.business.IActionManagement;
import com.foobartory.domain.Entrepots;


public class ActionManagement implements IActionManagement {
	
	
	 public synchronized IAction chooseAction(Entrepots entrepots) {
		 Action action = new Action();
	        if (entrepots.getEuros() >= 3 && entrepots.getListFoo().size() < 6) {
	            action.fooAction( entrepots);
	            return action;
	        }
	        if (entrepots.getListFooBar().size() >= 5) {
	        	action.sellFooBarAction( entrepots);
	        	return action;
	        }
	        if (entrepots.getEuros() >= 3 && entrepots.getListFoo().size() >= 6) {
	        	action.buyRobotAction( entrepots);
	        	return action;
	        }
	        if (entrepots.getListFoo().isEmpty()) {
	        	
	           action.fooAction( entrepots);
	           return action;
	        }
	        if (entrepots.getListBar().isEmpty()) {
	        	 action.barAction( entrepots);
	        	 return action;
	        }
	        if (!entrepots.getListFoo().isEmpty() && !entrepots.getListBar().isEmpty() )
	        {
	        	action.assemblerAction( entrepots);
	        	return action;
	        }
	         action.fooAction( entrepots);
	         return action;
	    }
	 
	 

}
