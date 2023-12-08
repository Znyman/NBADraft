package com.skilldistillery.nba.app;

import com.skilldistillery.nba.entities.*;

public class NBADraftApp {

	public static void main(String[] args) {
		
		NBADraftApp app = new NBADraftApp();
		app.run();
	}
	
	public PingPongBall run() {
		DraftManager draftManager = new DraftManager();
		PingPongBall winningBall = draftManager.runDraft();
		return winningBall;
	}

}
