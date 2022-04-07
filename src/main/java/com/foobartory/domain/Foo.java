package com.foobartory.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Foo {

	private int numSerie;
	
	public Foo()
	{
		this.numSerie=NumSerie.generateUniqueId();
	}
}
