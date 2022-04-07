package com.foobartory.business;



public interface IRobot {
	
	public void start() ;

    public void interrupt() ;

    public boolean isRunning() ;
    
    public void takeTimeAndExecuteAction(IAction action) ;
    


}
