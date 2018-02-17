
package org.usfirst.frc.team949.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team949.robot.commands.JoyStickDrive;

import org.usfirst.frc.team949.robot.subsystems.Arm;
import org.usfirst.frc.team949.robot.subsystems.Climber;
import org.usfirst.frc.team949.robot.subsystems.DriveTrain;
import org.usfirst.frc.team949.robot.subsystems.Pickup;

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
	public static final Pickup pickup = new Pickup();
	public static final Arm arm = new Arm();
	public static final Climber climber = new Climber();
	public static OI oi;

	private Command autonomousCommand;
	private SendableChooser<Command> chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		this.chooser.addDefault("Default Auto", new JoyStickDrive());
		// chooser.addObject("My Auto", new MyAutoCommand());
//		SmartDashboard.putData("Auto mode", chooser);
//		CameraServer.getInstance().addAxisCamera("10.9.49.104");
//		SmartDashboard.putNumber("Arm Angle", 0);
//		SmartDashboard.getData("Arm Angle");
//		
	}

	/** 
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

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
		autonomousCommand = chooser.getSelected();
		char testPosition = 'L'; // L M R TODO: Find a way to do it from SmartDashboard
		String targetScoring = "Scale"; // Switch Scale AutoLine TODO: Find a way to do it from SmartDashboard
		String gameData = DriverStation.getInstance().getGameSpecificMessage();
//		autonomousCommand = autonomousSwitchLogic(testPosition, targetScoring, gameData);
		
//		String autoSelected = SmartDashboard.getString("Auto Selector", "Default"); 
//		switch(autoSelected) {
//		case "My Auto": autonomousCommand = new MyAutoCommand();
//		break; 
//		case "Default Auto": 
//		default:
//		autonomousCommand = new ExampleCommand(); break; }
		 

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}
//	private Command autonomousSwitchLogic(char startingPosition, String targetScoring, String gameData) 
//	{	
//		final char L = 'L';
//		final char M = 'M';
//		final char R = 'R';
//		char firstSwitch = gameData.charAt(0);
//		char scale = gameData.charAt(1);
//		
//		switch (targetScoring)
//		{
//		case "Switch":
//			if(firstSwitch == L)
//			{
//				if(startingPosition == L) 
//				{
//					return new LeftSideLeftSwitch();
//				}
//				else if(startingPosition == M) 
//				{
//					return new MiddleSideLeftSwitch();
//				}
//				else if(startingPosition == R) 
//				{
//					return new RightSideLeftSwitch();
//				}
//			}
//			else if(firstSwitch == R) 
//			{
//				if(startingPosition == L) 
//				{
//					return new LeftSideRightSwitch();
//				}
//				else if(startingPosition == M) 
//				{
//					return new MiddleSideRightSwitch();
//				}
//				else if(startingPosition == R) 
//				{
//					return new RightSideRightSwitch();
//				}
//			}
//			else 
//			{
//				System.out.println("Something went wrong ");
//				throw new UnsupportedOperationException();
//			}
//			break;
//		case "Scale":
//			if(scale == L)
//			{
//				if(startingPosition == L) 
//				{
//					return new LeftSideLeftScale();
//				}
//				else if(startingPosition == M) 
//				{
//					return new MiddleSideLeftScale();
//				}
//				else if(startingPosition == R) 
//				{
//					return new RightSideLeftScale();
//				}
//			}
//			else if(scale == R) 
//			{
//				if(startingPosition == L) 
//				{
//					return new LeftSideLeftScale();
//				}
//				else if(startingPosition == M) 
//				{
//					return new MiddleSideLeftScale();
//				}
//				else if(startingPosition == R) 
//				{
//					return new RightSideLeftScale();
//				}
//			}
//			else 
//			{
//				System.out.println("Something went wrong ");
//				throw new UnsupportedOperationException();
//			}
//			break;
//		
//		case "AutoLine":
//			if(startingPosition == L) 
//			{
//				return new LeftAutoLine();
//			}
//			else if(startingPosition == M) 
//			{
//				return new MiddleAutoLine();
//			}
//			else if(startingPosition == R) 
//			{
//				return new RightAutoLine();
//			}
//			break;
//		case "Default":
//			default:
//				return new Wait();
//		}		
//		
//		
//		return targetCommand;
//	}

	/**
	 * This function is called periodically during autonomous
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

	
	private double leftMaxVelocity; // TODO: ONLY FOR TRAJECTORY CONSTANT TESTING. PLEASE DELETE LATER.
	private double rightMaxVelocity; // TODO: ONLY FOR TRAJECTORY CONSTANT TESTING. PLEASE DELETE LATER.
	
	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run(); // Keep this
		
		double leftRate = driveTrain.getLeftVelocity();
		double rightRate = driveTrain.getRightVelocity();
		if(leftRate > leftMaxVelocity) 
		{
			leftMaxVelocity = leftRate;
		}
		if(rightRate > rightMaxVelocity) 
		{
			rightMaxVelocity = rightRate;
		}
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		
	}
}
