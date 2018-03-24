
package com.team949;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
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
import com.team949.commands.HandStow;
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

		UsbCamera driveCamera = CameraServer.getInstance().startAutomaticCapture(0);

		driveCamera.setFPS(20);
		driveCamera.setResolution(320, 240);

		UsbCamera armCamera = CameraServer.getInstance().startAutomaticCapture(1);
		armCamera.setFPS(20);
		armCamera.setResolution(320, 240);

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
		Robot.driveTrain.gyroCalibrate(); // TODO: Calibration happens on each
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
		// char startingPosition = startingPositionChooser.getSelected();
		// String targetScoring = targetScoringChooser.getSelected();
		// String gameData =
		// DriverStation.getInstance().getGameSpecificMessage();
		// autonomousCommand = autonomousSwitchLogic(startingPosition,
		// targetScoring, gameData);

		// String autoSelected = SmartDashboard.getString("Auto Selector",
		// "Default");
		// switch(autoSelected) {
		// case "My Auto": autonomousCommand = new MyAutoCommand();
		// break;
		// case "Default Auto":
		// default:
		// autonomousCommand = new ExampleCommand(); break; }
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

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
	private Command armL = new ArmLower(), armR = new ArmRaise(), wristStow = new HandStow();

	private final static double Y_THRESHOLD = 0.3;
	private final static double Z_THRESHOLD = 0.5;

	private final static double Y_NERF = 1.0;
	private final static double Z_NERF = 0.6;

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

		yInput = Y_NERF * (Math.abs(yInput) < Y_THRESHOLD ? 0
				: (Math.signum(yInput) * ((Math.abs(yInput) - Y_THRESHOLD) / (1 - Y_THRESHOLD))));
		zInput = Z_NERF * (Math.abs(zInput) < Z_THRESHOLD ? 0
				: (Math.signum(zInput) * ((Math.abs(zInput) - Z_THRESHOLD) / (1 - Z_THRESHOLD))));
		driveTrain.arcade(yInput, zInput);
		// arm
		if (drive.getRawButtonPressed(10)) {
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
		if (armManual)
			arm.move(drive.getThrottle());

		// operator stick
		// wrist
		if (op.getRawButtonPressed(8)) {
			wristStow.cancel();
			wristManual = true;
		}
		if (drive.getRawButtonPressed(7)) {
			wristManual = false;
			wristStow.start();
		}
		if (wristManual)
			hand.setWrist(op.getY());
		// pneumatics
		if (op.getRawButtonPressed(11))
			hand.open();
		if (op.getRawButtonPressed(12))
			hand.close();
		// shoot
		if (op.getRawButton(10))
			hand.setIntake(0.5);
		else if (op.getRawButton(9))
			hand.setIntake(-0.5);
		else
			hand.setIntake(0);
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {

	}
}
