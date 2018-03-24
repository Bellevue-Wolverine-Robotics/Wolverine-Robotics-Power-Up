package com.team949.commands;

import com.team949.Robot;
import com.team949.subsystems.Arm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmLower extends Command {

	// TODO: Tune
	private final double kArmInitial = 0.2;
	private final double kArmLowerMax = 0.4;
	private final double kArmLowStall = 0.1;

	public ArmLower() {
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
    	if (angle > Math.toRadians(30))
    		out = -kArmInitial;
    	else if (angle > Math.toRadians(5 + Arm.startingAngle) && angle < Math.toRadians(30))
    		out = Math.cos(angle) * kArmLowerMax;
    	else if (angle < Math.toRadians(5 + Arm.startingAngle))
    		out = -kArmLowStall;
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
