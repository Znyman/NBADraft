package com.skilldistillery.nba.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DraftManager {

	private Hopper hopper = new Hopper();
	private PingPongBallFactory factory = new PingPongBallFactory();

	public PingPongBall runDraft() {

		Map<String, Integer> purchaseOrder = createDraftPurchaseOrder();
		List<PingPongBall> listOfBalls = factory.createBalls(purchaseOrder);
		hopper.loadHopper(listOfBalls);
		hopper.turnOn();
		PingPongBall winningBall = hopper.releaseWinningBall();
		//System.out.println(winningBall);
		return winningBall;
	}

	private Map<String, Integer> createDraftPurchaseOrder() {

		Map<String, Integer> purchaseOrder = new HashMap<>();

		purchaseOrder.put("Honey Badgers", 250);
		purchaseOrder.put("Golden Hawks", 199);
		purchaseOrder.put("Savage Squad", 156);
		purchaseOrder.put("Velocity", 119);
		purchaseOrder.put("Diamond Dinosaurs", 88);
		purchaseOrder.put("Limitless Legion", 63);
		purchaseOrder.put("Visionary Vanguard", 43);
		purchaseOrder.put("The Kings", 28);
		purchaseOrder.put("Hustlers", 17);
		purchaseOrder.put("Bulletproof", 11);
		purchaseOrder.put("Ninja Bros", 8);
		purchaseOrder.put("Mister Maniacs", 7);
		purchaseOrder.put("Unstoppable Force", 6);
		purchaseOrder.put("Big Shots", 5);

		return purchaseOrder;
	}

}
