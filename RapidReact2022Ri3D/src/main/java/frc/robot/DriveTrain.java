// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

/** Class to Drive the Robot */
public class DriveTrain {
    private Spark m_sideleft, m_sideright;
    private DifferentialDrive m_drive;

    public DriveTrain()
    {
        m_sideleft = new Spark(Variables.SPARK_DRIVELEFT);
        m_sideright = new Spark(Variables.SPARK_DRIVERIGHT);
        m_sideleft.setInverted(Variables.INVERTED_DRIVELEFT);
        m_sideright.setInverted(Variables.INVERTED_DRIVERIGHT);

        m_drive = new DifferentialDrive(m_sideleft, m_sideright);
    }

    /**
     * Command the drivetrain with a tankdrive command.
     * @param left -1.0 to 1.0
     * @param right -1.0 to 1.0
     * @param squareInputs When true, inputs are squared.
     */
    public void driveTank(double left, double right, boolean squareInputs)
    {
        m_drive.tankDrive(left, right, squareInputs);
    }

    /**
     * Command the drivetrain with an arcade command.
     * @param xSpeed -1.0 to 1.0
     * @param zRotation -1.0 (CounterClockwise) to 1.0 (Clockwise)
     * @param squareInputs When true, inputs are sqaured.
     */
    public void driveArcade(double xSpeed, double zRotation, boolean squareInputs)
    {
        m_drive.arcadeDrive(xSpeed, zRotation, squareInputs);
    }

    /**
     * Comand the drivetrain to stop.
     */
    public void commandStop()
    {
        m_drive.stopMotor();
    }
}
