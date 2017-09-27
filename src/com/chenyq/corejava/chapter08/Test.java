package com.chenyq.corejava.chapter08;

import java.time.LocalDate;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		DateInterval interval = new DateInterval();
		interval.setFirst(LocalDate.of(2017, 8, 22));
		Pair<LocalDate> pair = interval;
		pair.setSecond(LocalDate.of(2017, 8, 23));
	}
}
