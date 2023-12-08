package com.skilldistillery.lottery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skilldistillery.nba.entities.Hopper;
import com.skilldistillery.nba.entities.PingPongBall;
import com.skilldistillery.nba.entities.PingPongBallFactory;

public class VannaWhite {
	
	Hopper hopper = new Hopper();
	PingPongBallFactory factory = new PingPongBallFactory();
	
	public void runLottery() {
		Map<String, Integer> ballOrder = createLotteryBallOrder();
		List<PingPongBall> boxOfBalls = factory.createBalls(ballOrder);
		hopper.loadHopper(boxOfBalls);
		hopper.turnOn();
		List<PingPongBall> winningBalls = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			PingPongBall winningBall = hopper.releaseWinningBall();
			winningBalls.add(winningBall);
		}
		System.out.println(winningBalls);
	}
	
	public Map<String, Integer> createLotteryBallOrder() {
		
		Map<String, Integer> ballOrder = new HashMap<>();
		for (int i = 1; i <= 95; i++) {
			ballOrder.put(String.valueOf(i), 1);
		}
		return ballOrder;
	}

}
