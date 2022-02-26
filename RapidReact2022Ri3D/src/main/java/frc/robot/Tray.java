// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Servo;

/** Class to control the gate of for the tray. */
public class Tray {
    Servo m_servo;

    public Tray()
    {
        m_servo = new Servo(Variables.TRAY_SERVO);
    }

    /**
     * Commands the gate using a percentage.
     * @param percent 0.0 to 1.0 TODO which is in and which is out?
     */
    public void setPercent(double percent)
    {
        m_servo.set(percent);
    }

    /**
     * Commands the gate to a specific angle.
     * @param degrees TODO check angle 0 to 180 TODO which is in and which is out?
     */
    public void setAngle(double degrees)
    {
        m_servo.setAngle(degrees);
    }

    /**
     * Gets the last command given to the gate.
     */
    public double getAngle()
    {
        return m_servo.getAngle();
    }
}
