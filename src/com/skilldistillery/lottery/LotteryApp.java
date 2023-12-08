package com.skilldistillery.lottery;

public class LotteryApp {

	public static void main(String[] args) {
		
		LotteryApp app = new LotteryApp();
		app.run();
	}
	
	public void run() {
		VannaWhite vanna = new VannaWhite();
		vanna.runLottery();
	}
}
