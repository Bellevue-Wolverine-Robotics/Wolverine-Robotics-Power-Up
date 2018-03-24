package com.team949.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.team949.Robot;
import com.team949.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {

	// Initialize your subsystem here
	private WPI_TalonSRX armMotor;
	public static final double startingAngle = -45; /* TODO: Replace with actual arm resting angle*/

	public Arm() {
		armMotor = new WPI_TalonSRX(RobotMap.armMotor);

		armMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		armMotor.setSensorPhase(false);
		armMotor.setSelectedSensorPosition(0, 0, 0);
	}

	public void initDefaultCommand() {
		setDefaultCommand(null);
	}

	public double getEncoderPosition() {
		return armMotor.getSelectedSensorPosition(0);
	}

	public double getEncoderVelocity() {
		return armMotor.getSelectedSensorVelocity(0);
	}
	
	/**
	 * 
	 * @return angle of arm, 0 is parallel to ground, in radians
	 */
	public double getAngle() {
		return Math.toRadians(getEncoderPosition() / 4096 * 360 + startingAngle);
	}

	/**
	 * Default .set() method
	 * 
	 * @param moveValue
	 *            -1.0 to 1.0
	 */
	public void move(double moveValue) {
		armMotor.set(moveValue);
	}
	
	public boolean raised() {
		return getEncoderPosition() > (130. / 360 * 4096); // 130 deg elevation * 4096 units/rev
	}
	
	public boolean lowered() {
		return getEncoderPosition() < (5. / 360 * 4096);
	}

}
