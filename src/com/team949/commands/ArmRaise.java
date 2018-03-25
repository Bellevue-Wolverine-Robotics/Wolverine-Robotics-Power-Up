package com.team949.commands;

import com.team949.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmRaise extends Command {

	// TODO: Tune
	private final double kArmRaiseMax = 0.5;
	private final double kArmUpStall = 0.05;

	public ArmRaise() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double angle = Robot.arm.getAngle();
		double out = 0;
		// if (angle < 0)
		// out = Math.cos(angle) * kArmRaiseMax;
		// else if (angle > 0 && angle < Math.toRadians(60))
		// out = 0;
		// else if (angle > Math.toRadians(80))
		// out = kArmUpStall;
		out = Math.cos(Robot.arm.getAngle());
		if (Robot.arm.getAngle() > Math.toRadians(45)) {
			out *= 0.8;
			out += 0.1;
		}
		if (Robot.arm.getAngle() > Math.toRadians(85))
			out = kArmUpStall;
		Robot.arm.move(out);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
