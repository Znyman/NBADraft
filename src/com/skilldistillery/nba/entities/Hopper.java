package com.skilldistillery.nba.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Hopper {
	
	private List<PingPongBall> cage;

	public Hopper() {
		cage = new ArrayList<>();
	}
	
	public List<PingPongBall> getCage() {
		return cage;
	}

	public void setCage(List<PingPongBall> cage) {
		this.cage = cage;
	}

	public void loadHopper(List<PingPongBall> inputBalls) {
		setCage(inputBalls);
	}
	
	public void turnOn() {
		Collections.shuffle(cage);
	}
	
	public PingPongBall releaseWinningBall() {
		Random rand = new Random();
		return cage.remove(rand.nextInt(cage.size() - 1));
	}

}
