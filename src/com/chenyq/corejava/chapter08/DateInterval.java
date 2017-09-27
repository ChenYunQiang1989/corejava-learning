package com.chenyq.corejava.chapter08;

import java.time.LocalDate;

public class DateInterval extends Pair<LocalDate> {
	
	@Override
	public void setSecond(LocalDate second) {
		if(second.compareTo(getFirst()) >= 0)
			super.setSecond(second);
	}
}

/*
 *  
 * 
 * 
 * 
 *
 */