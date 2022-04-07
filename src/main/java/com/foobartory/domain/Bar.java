package com.foobartory.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Bar {
		private int numSerie;
		public Bar()
		{
			this.numSerie=NumSerie.generateUniqueId();
		}
}
