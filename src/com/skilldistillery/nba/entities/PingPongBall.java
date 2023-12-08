package com.skilldistillery.nba.entities;

import java.util.Objects;

public class PingPongBall implements Comparable<PingPongBall> {
	
	private String label;

	public PingPongBall(String label) {
		setLabel(label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}

	@Override
	public int compareTo(PingPongBall arg0) {
		return arg0.label.compareTo(this.label);
	}

	@Override
	public int hashCode() {
		return Objects.hash(label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PingPongBall))
			return false;
		PingPongBall other = (PingPongBall) obj;
		return Objects.equals(label, other.label);
	}
	
	

}
