package org.usfirst.frc.team949.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {

	// MOTORS
	// DriveTrain
	public final static int leftMaster = 1;
	public final static int leftSlave = 0;
	public final static int rigthMaster = 3;
	public final static int rightSlave = 2;

	// Pickup
	public final static int leftPickupMotor = 6;
	public final static int rightPickupMotor = 7;
	public final static int wristMotor = 9;

	// Arm
	public final static int armMotor = 8;

	// Climber
	public final static int climberMotor1 = 4;
	public final static int climberMotor2 = 5;

	// PNEUMATICS

}
