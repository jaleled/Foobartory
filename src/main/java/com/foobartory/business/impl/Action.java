package com.foobartory.business.impl;




import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;


import com.foobartory.business.IAction;
import com.foobartory.domain.Bar;
import com.foobartory.domain.Entrepots;
import com.foobartory.domain.Foo;
import com.foobartory.domain.FooBar;
import lombok.Data;
import com.foobartory.domain.ActionType;


@Data
public class Action implements IAction {
	
	private int timeMin;
	private int timeMax;
	private ActionType actionType;
	private Random rand;



	public Entrepots fooAction(Entrepots entrepots)
	{
		Foo foo = new Foo();
		entrepots.getListFoo().add(foo);
		this.timeMin=100;
		this.timeMax=100;
		this.actionType=ActionType.MINE_FOO;
		
		return entrepots;
		
	}
	
	public Entrepots barAction(Entrepots entrepots)
	{
		Bar bar = new Bar();
		entrepots.getListBar().add(bar);
		this.timeMin=50;
		this.timeMax=200;
		this.actionType=ActionType.MINE_BAR;
		return entrepots;
		
	}
	public  synchronized Entrepots assemblerAction(Entrepots entrepots)
	{
		this.timeMin=200;
		this.timeMax=200;
		this.actionType=ActionType.ASSEMBLE_FOOBAR;
	   if (assembleFoobarIsSuccess(60)) {
   		FooBar foobar= new FooBar(entrepots.deleteFoo(),entrepots.deleteBar());
   		entrepots.getListFooBar().add(foobar);
   		return entrepots;
       } else {
    	   entrepots.deleteFoo();
           return entrepots;
       }
		
		
	}
	public  synchronized Entrepots sellFooBarAction(Entrepots entrepots)
	{
		
			entrepots.getListFooBar().remove(entrepots.getListFooBar().size() - 1);
			entrepots.setEuros(entrepots.getEuros()+1);
			this.timeMin=1000;
			this.timeMax=1000;
			this.actionType=ActionType.SELL_FOOBAR;
		return entrepots;
		
	}
	public synchronized Entrepots buyRobotAction(Entrepots entrepots)
	{
		entrepots.setEuros(entrepots.getEuros() - 3);
		int k=6;
		while(k!=0)
		{
			entrepots.getListFoo().remove(entrepots.getListFoo().size() - 1);
	       k--;
		}
		this.timeMin=0;
		this.timeMax=0;
		this.actionType=ActionType.BUY_ROBOT;
		return entrepots;
		
	}
	
	
    public int getRandomTime(){
        if (getTimeMax() != getTimeMin()) {
            return getTimeMin() + (int) (Math.random() * ((getTimeMax() - getTimeMin()) + 1));
        }else{
            return getTimeMin();
        }
	}
    
     
     
    public boolean assembleFoobarIsSuccess(int pourcentage) {
		try {
			rand = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        int randomNumber = this.rand.nextInt(10) +1;
        boolean assembleFoobarIsSuccess = (randomNumber <= (pourcentage/10));
        ProductionLine.printAssembleFoobarResult(assembleFoobarIsSuccess);
        return assembleFoobarIsSuccess;
    }


    
    
}
