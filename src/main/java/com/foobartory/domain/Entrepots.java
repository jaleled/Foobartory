package com.foobartory.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
public class Entrepots {
	
	    private int euros;
	    private List<Foo> listFoo = new ArrayList<>();
	    private List<Bar> listBar = new ArrayList<>();
	    private List<FooBar> listFooBar = new ArrayList<>();
	    public synchronized Foo deleteFoo()
	    {
	    	return this.getListFoo().remove(this.getListFoo().size() - 1);
	    }
	    public  synchronized Bar deleteBar()
	    {
	    	return  this.getListBar().remove(this.getListBar().size() - 1);
	    }
	    

}
