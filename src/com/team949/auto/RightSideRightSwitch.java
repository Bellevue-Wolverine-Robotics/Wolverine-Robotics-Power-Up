package com.team949.auto;

import com.team949.Robot;
import com.team949.commands.ArmRaise;
import com.team949.commands.ShitForward;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class RightSideRightSwitch extends CommandGroup {

	public RightSideRightSwitch() {
		addSequential(new ShitForward(8));
		addSequential(new HardTurn(1.0, -90.0));
		addParallel(new ArmRaise());
		addSequential(new Command() {

			// Called just before this Command runs the first time
			protected void initialize() {
			}

			// Called repeatedly when this Command is scheduled to run
			protected void execute() {
			}

			// Called once after timeout
			protected void end() {
			}

			// Called when another command which requires one or more of the
			// same
			// subsystems is scheduled to run
			protected void interrupted() {
			}

			@Override
			protected boolean isFinished() {
				// TODO Auto-generated method stub
				return Robot.arm.getAngle() > Math.toRadians(80);
			}
		});
		addSequential(new TimedCommand(0.5) {

			// Called just before this Command runs the first time
			protected void initialize() {
			}

			// Called repeatedly when this Command is scheduled to run
			protected void execute() {
				Robot.hand.setIntake(-1);
			}

			// Called once after timeout
			protected void end() {
				Robot.hand.setIntake(0);
			}

			// Called when another command which requires one or more of the
			// same
			// subsystems is scheduled to run
			protected void interrupted() {
				Robot.hand.setIntake(0);
			}
		});
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}
}
