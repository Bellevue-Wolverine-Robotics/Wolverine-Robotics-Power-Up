package com.team319.trajectory;

import org.json.simple.JSONObject;

//Combines left and right motion profiles in one object
public class SrxTrajectory {
	public SrxMotionProfile leftProfile;
	public SrxMotionProfile rightProfile;

	public SrxTrajectory(SrxMotionProfile left, SrxMotionProfile right) {
		this.leftProfile = left;
		this.rightProfile = right;
	}

	public SrxTrajectory(JSONObject json){
		leftProfile = new SrxMotionProfile((JSONObject) json.get("left"));
		rightProfile = new SrxMotionProfile((JSONObject) json.get("right"));
	}

	public SrxTrajectory() {
		// TODO Auto-generated constructor stub
//		leftProfile and rightProfile are modified later
//		(generated trajectories extend this class and then modify the fields directly.)
	}

	public JSONObject toJson(){
		JSONObject trajectory = new JSONObject();
		trajectory.put("left", leftProfile.toJson());
		trajectory.put("right",rightProfile.toJson());
		return trajectory;
	}

}
