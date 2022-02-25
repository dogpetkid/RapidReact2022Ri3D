// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Servo;

/** Class to operate the moving parts associated to the tray. */
public class Tray {
    private Servo m_servo1, m_servo2;

    public Tray()
    {
        m_servo1 = new Servo(Variables.TRAY_SERVO_1);
        m_servo1.setBounds(Constants.LinearActuator.max,
                        Constants.LinearActuator.deadbandMax,
                        Constants.LinearActuator.center,
                        Constants.LinearActuator.deadbandMin,
                        Constants.LinearActuator.min
        );
        m_servo2 = new Servo(Variables.TRAY_SERVO_2);
        m_servo2.setBounds(Constants.LinearActuator.max,
                        Constants.LinearActuator.deadbandMax,
                        Constants.LinearActuator.center,
                        Constants.LinearActuator.deadbandMin,
                        Constants.LinearActuator.min
        );
    }

    /**
     * Command to lower the gate on the tray.
     */
    public void lowerGate()
    {
        m_servo1.setSpeed(Constants.LinearActuator.COMMAND_RETRACT);
        m_servo2.setSpeed(Constants.LinearActuator.COMMAND_RETRACT);
    }

    /**
     * Command to raise the gate on the tray.
     */
    public void raiseGate()
    {
        m_servo1.setSpeed(Constants.LinearActuator.COMMAND_EXTEND);
        m_servo2.setSpeed(Constants.LinearActuator.COMMAND_EXTEND);
    }

    /**
     * Command to move the gate to a position.
     * @param position -1.0 (lowered) to 1.0 (raised)
     */
    public void positionGate(double position)
    {
        m_servo1.setSpeed(position);
        m_servo2.setSpeed(position);
    }

}
