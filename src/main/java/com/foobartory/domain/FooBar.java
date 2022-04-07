package com.foobartory.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class FooBar {

	private String numSerieFooBar;
	private Bar bar;
	private Foo foo;
	
	public FooBar(Foo foo,Bar bar)
	{
		this.foo=foo;
		this.bar=bar;
		this.numSerieFooBar=foo.getNumSerie()+"__"+bar.getNumSerie();
	}
	
}
