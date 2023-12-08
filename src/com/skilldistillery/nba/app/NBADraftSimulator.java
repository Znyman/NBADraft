package com.skilldistillery.nba.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.skilldistillery.nba.entities.PingPongBall;

public class NBADraftSimulator {

	public static void main(String[] args) {
		
		NBADraftSimulator simulatorApp = new NBADraftSimulator();
		simulatorApp.run();
	}
	
	public void run() {
		
		int runs = 1000;
		
		Map<PingPongBall, Integer> mapOfWinningBalls = new HashMap<>();
		
		NBADraftApp app = new NBADraftApp();
		for (int run = 0; run < runs; run++) {
			PingPongBall winningBall = app.run();
			if (mapOfWinningBalls.containsKey(winningBall)) {
				mapOfWinningBalls.put(winningBall, mapOfWinningBalls.get(winningBall) + 1);
			} else {
				mapOfWinningBalls.put(winningBall, 1);
			}
		}
		printMapSortedByValue(mapOfWinningBalls);
	}
	
	public List<Map.Entry<PingPongBall, Integer>> sortMapByValue(Map<PingPongBall, Integer> inputMap) {
		List<Map.Entry<PingPongBall, Integer>> listOfMap = new ArrayList<>(inputMap.entrySet());
		listOfMap.sort(Map.Entry.comparingByValue());
		return listOfMap;
	}
		
	public void printMapSortedByValue(Map<PingPongBall, Integer> inputMap) {
		List<Map.Entry<PingPongBall, Integer>> sortedMapByValue = sortMapByValue(inputMap);
		for (Entry<PingPongBall, Integer> keyValue : sortedMapByValue) {
			System.out.println(keyValue.getKey() + ": " + keyValue.getValue());
		}
	}

}
