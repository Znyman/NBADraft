package com.skilldistillery.nba.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PingPongBallFactory {
	
	public List<PingPongBall> createBalls(Map<String, Integer> inputPurchaseOrder) {
		List<PingPongBall> pingPongBalls = new ArrayList<>();
		
		Set<String> keys = inputPurchaseOrder.keySet();
		for (String key : keys) {
			for (int i = 0; i < inputPurchaseOrder.get(key); i++) {
				pingPongBalls.add(new PingPongBall(key));
			}
		}
		return pingPongBalls;
	}

}
