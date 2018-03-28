
package com.team949;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.io.IOException;

import com.team949.auto.HardArmMove;
import com.team949.auto.HardMoveForward;
import com.team949.auto.HardTurn;
import com.team949.commands.ArmLower;
import com.team949.commands.ArmRaise;
import com.team949.commands.DelayedShoot;
import com.team949.commands.FollowTrajectory;
import com.team949.commands.HandLower;
import com.team949.commands.HandStow;
import com.team949.commands.ShitForward;
import com.team949.commands.Test;
import com.team949.paths.ThreeFeet;
import com.team949.subsystems.Arm;
import com.team949.subsystems.Climber;
import com.team949.subsystems.DriveTrain;
import com.team949.subsystems.Hand;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {
	// Please keep these as public unless you have a good reason.
	public static final DriveTrain driveTrain = new DriveTrain();
	public static final Hand hand = new Hand();
	public static final Arm arm = new Arm();
	public static final Climber climber = new Climber();
	public static OI oi;

	private Command autonomousCommand;
	private SendableChooser<Character> startingPositionChooser = new SendableChooser<>();
	private SendableChooser<String> targetScoringChooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();

		UsbCamera driveCamera = CameraServer.getInstance().startAutomaticCapture(1);

		driveCamera.setFPS(15);
		driveCamera.setResolution(160, 120);

		UsbCamera armCamera = CameraServer.getInstance().startAutomaticCapture(0);
		armCamera.setFPS(15);
		armCamera.setResolution(160, 120);

		this.startingPositionChooser.addDefault("Left", 'L');
		this.startingPositionChooser.addObject("Middle", 'M');
		this.startingPositionChooser.addObject("Right", 'R');
		SmartDashboard.putData("Auto: Starting Position", this.startingPositionChooser);

		this.targetScoringChooser.addDefault("AutoLine", "AutoLine");
		this.targetScoringChooser.addDefault("Switch", "Switch");
		this.targetScoringChooser.addDefault("Scale", "Scale");
		SmartDashboard.putData("Auto: Target Scoring", this.targetScoringChooser);

		// CameraServer.getInstance().addAxisCamera("10.9.49.104");
		// SmartDashboard.putNumber("Arm Angle", 0);
		// SmartDashboard.getData("Arm Angle");

	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
		// Robot.driveTrain.gyroCalibrate(); // TODO: Calibration happens on
		// each
		// disable. Could be dangerous.
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		char startingPosition = startingPositionChooser.getSelected();
		String targetScoring = targetScoringChooser.getSelected();
		String gameData = DriverStation.getInstance().getGameSpecificMessage();

		// String autoSelected = SmartDashboard.getString("Auto Selector",
		// "Default");
		// switch (autoSelected) {
		// case "My Auto":
		// autonomousCommand = new HardMoveForward(10);
		// break;
		// case "Default Auto":
		// default:
		// autonomousCommand = new HardMoveForward(10);
		// break;
		// }
		// schedule the autonomous command (example)

		// // autonomousCommand = new ShitForward(4);
		// autonomousCommand = new HardMoveForward(4 * 12);
		// if (autonomousCommand != null)
		// autonomousCommand.start();
//		c = new CommandGroup();
//		for (double i = 0; i <= 1; i += 0.01)
//			c.addSequential(new Test(0.2, i));
//		c.start();
		//autonomousCommand;
		FollowTrajectory traj = new FollowTrajectory(new ThreeFeet());
		autonomousCommand = traj;
	}

	private CommandGroup c;

	/*
	 * private Command autonomousSwitchLogic(char startingPosition, String
	 * targetScoring, String gameData) { return new final char L = 'L'; final
	 * char M = 'M'; final char R = 'R'; char firstSwitch = gameData.charAt(0);
	 * char scale = gameData.charAt(1);
	 * 
	 * switch (targetScoring) { case "Switch": if(firstSwitch == L) {
	 * if(startingPosition == L) { return new LeftSideLeftSwitch(); } else
	 * if(startingPosition == M) { return new MiddleSideLeftSwitch(); } else
	 * if(startingPosition == R) { return new RightSideLeftSwitch(); } } else
	 * if(firstSwitch == R) { if(startingPosition == L) { return new
	 * LeftSideRightSwitch(); } else if(startingPosition == M) { return new
	 * MiddleSideRightSwitch(); } else if(startingPosition == R) { return new
	 * RightSideRightSwitch(); } } else { System.out.println(
	 * "Something went wrong "); throw new UnsupportedOperationException(); }
	 * break; case "Scale": if(scale == L) { if(startingPosition == L) { return
	 * new LeftSideLeftScale(); } else if(startingPosition == M) { return new
	 * MiddleSideLeftScale(); } else if(startingPosition == R) { return new
	 * RightSideLeftScale(); } } else if(scale == R) { if(startingPosition == L)
	 * { return new LeftSideLeftScale(); } else if(startingPosition == M) {
	 * return new MiddleSideLeftScale(); } else if(startingPosition == R) {
	 * return new RightSideLeftScale(); } } else { System.out.println(
	 * "Something went wrong "); throw new UnsupportedOperationException(); }
	 * break;
	 * 
	 * case "AutoLine": if(startingPosition == L) { return new LeftAutoLine(); }
	 * else if(startingPosition == M) { return new MiddleAutoLine(); } else
	 * if(startingPosition == R) { return new RightAutoLine(); } break; case
	 * "Default": default: return new Wait(); }
	 * 
	 * 
	 * return targetCommand; }
	 * 
	 * /** This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {

		SmartDashboard.putNumber("ArmAngle", Math.toDegrees(arm.getAngle()));
		SmartDashboard.putNumber("WristAngle", Math.toDegrees(hand.getAngle()));
		SmartDashboard.putNumber("PosL", driveTrain.getLeftPosition());
		SmartDashboard.putNumber("PosR", driveTrain.getRightPosition());
		SmartDashboard.putNumber("VelL", driveTrain.getLeftVelocity());
		SmartDashboard.putNumber("VelR", driveTrain.getRightVelocity());

		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.

		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	// private double leftMaxVelocity; // TODO: ONLY FOR TRAJECTORY CONSTANT
	// TESTING. PLEASE DELETE LATER.
	// private double rightMaxVelocity; // TODO: ONLY FOR TRAJECTORY CONSTANT
	// TESTING. PLEASE DELETE LATER.

	/**
	 * This function is called periodically during operator control
	 */
	private boolean wristManual = false, armManual = false;
	private Command armL = new ArmLower(), armR = new ArmRaise(), wristStow = new HandStow(),
			shoot = new DelayedShoot(0.5, -0.5, 1);

	private final static double Y_THRESHOLD = 0.3;
	private final static double Z_THRESHOLD = 0.3;
	private final static double H_THRESHOLD = 0.3;

	private final static double Y_NERF = 1;
	private static double Z_NERF = 0.8;
	private final static double H_NERF = 0.4;

	@Override
	public void teleopPeriodic() {
		SmartDashboard.putNumber("ArmAngle", Math.toDegrees(arm.getAngle()));
		SmartDashboard.putNumber("WristAngle", Math.toDegrees(hand.getAngle()));
		SmartDashboard.putNumber("PosL", driveTrain.getLeftPosition());
		SmartDashboard.putNumber("PosR", driveTrain.getRightPosition());
		SmartDashboard.putNumber("VelL", driveTrain.getLeftVelocity());
		SmartDashboard.putNumber("VelR", driveTrain.getRightVelocity());

		Joystick drive = oi.driveStick, op = oi.operatorStick;
		// drivestick
		// drivetrain
		double yInput = drive.getY();
		double zInput = drive.getZ();

		yInput = Y_NERF * (Math.abs(yInput) < Y_THRESHOLD ? 0 : -yInput);
		zInput = Z_NERF * (Math.abs(zInput) < Z_THRESHOLD ? 0 : -zInput);
		driveTrain.arcade(yInput, zInput);
		// arm
		if (drive.getRawButtonPressed(7))
			Z_NERF = 0.5;
		if (drive.getRawButtonPressed(8))
			Z_NERF = 0.8;
		if (drive.getRawButtonPressed(10) || drive.getRawButtonPressed(3) || drive.getRawButtonPressed(4)
				|| drive.getRawButtonPressed(6)) {
			armL.cancel();
			armR.cancel();
			armManual = true;
		}
		if (drive.getRawButtonPressed(9))
			armManual = false;
		if (drive.getRawButtonPressed(11)) {
			armManual = false;
			armR.cancel();
			armL.start();
		}
		if (drive.getRawButtonPressed(12)) {
			armManual = false;
			armL.cancel();
			armR.start();
		}

		if (drive.getRawButton(4))
			climber.setMotors(1);
		else
			climber.setMotors(0);
		if (armManual) {
			if (drive.getRawButton(6))
				arm.move(-1);
			else if (drive.getRawButton(3))
				// arm.move(drive.getThrottle());
				arm.move(0.3);
			else
				arm.move(0);
		}
		// System.out.println(yInput * Math.cos(arm.getAngle()));

		// operator stick
		// wrist
		double hInput = op.getY();
		hInput = H_NERF * (Math.abs(hInput) < H_THRESHOLD ? 0 : hInput);
		if (op.getRawButtonPressed(10)) {
			wristStow.cancel();
			wristManual = true;
		}
		if (op.getRawButtonPressed(9)) {
			wristManual = false;
			wristStow.start();
		}

		if (wristManual)
			hand.setWrist(hInput);
		// pneumatics
		if (op.getRawButtonPressed(11))
			hand.open();
		if (op.getRawButtonPressed(12))
			hand.close();
		// shoot
		if (op.getRawButton(2)) {
			shoot.cancel();
			hand.setIntake(0.8);
		} else if (op.getRawButton(1)) {
			shoot.cancel();
			hand.setIntake(-1);
		} else if (op.getRawButtonPressed(3)) {
			hand.open();
			shoot.start();

		}
		if (op.getRawButtonReleased(1) || op.getRawButtonReleased(2)) {
			hand.setIntake(0);
		}
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		SmartDashboard.putNumber("ArmAngle", Math.toDegrees(arm.getAngle()));
		SmartDashboard.putNumber("WristAngle", Math.toDegrees(hand.getAngle()));
		SmartDashboard.putNumber("PosL", driveTrain.getLeftPosition());
		SmartDashboard.putNumber("PosR", driveTrain.getRightPosition());
		SmartDashboard.putNumber("VelL", driveTrain.getLeftVelocity());
		SmartDashboard.putNumber("VelR", driveTrain.getRightVelocity());

	}
}
