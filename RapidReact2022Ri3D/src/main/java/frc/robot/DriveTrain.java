// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

/** Class to Drive the Robot */
public class DriveTrain {
    private Spark m_sideleft, m_sideright;

    public DriveTrain()
    {
        m_sideleft = new Spark(Variables.SPARK_DRIVELEFT);
        m_sideright = new Spark(Variables.SPARK_DRIVERIGHT);
        m_sideleft.setInverted(Variables.INVERTED_DRIVELEFT);
        m_sideright.setInverted(Variables.INVERTED_DRIVERIGHT);
    }

    /**
     * Command the drivetrain by a percent.
     * @param left -1.0 to 1.0
     * @param right -1.0 to 1.0
     */
    public void drivePercent(double left, double right)
    {
        m_sideleft.set(left);
        m_sideright.set(right);
    }

    /**
     * Comand the drivetrain to stop.
     */
    public void commandStop()
    {
        m_sideleft.stopMotor();
        m_sideright.stopMotor();
    }
}
