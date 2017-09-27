package com.chenyq.corejava.chapter06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TalkingClock {
	
	public static void main(String[] args) {
		
	}

	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval , boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start() {
		// ActionListener listener = new TimerPrinter();
		ActionListener listener = this.new TimerPrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	public class TimerPrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("111111111");
			// if(beep) {
			if(TalkingClock.this.beep) {
				System.out.println("222222222222");
			}
		}
	}
}
