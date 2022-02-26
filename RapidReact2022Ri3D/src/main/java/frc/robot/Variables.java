// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** A class containing variable values (ie ports for controllers or values associated to the robot). */
public class Variables {
    // Controller IDs
    public static final int CONTROLLER_XBOX = 0;

    // Control
    public static final boolean INPUT_SQUARED = true;

    // Motor controller IDs
    public static final int SPARK_DRIVELEFT = 0;
    public static final int SPARK_DRIVERIGHT = 1;
    public static final int TRAY_SERVO = 3;

    // Motor controller Inverted
    public static final boolean INVERTED_DRIVELEFT = true;
    public static final boolean INVERTED_DRIVERIGHT = false;

    // Tray positions
    public static final double TRAY_OPEN = 1.0; // servo percent
    public static final double TRAY_CLOSED = 0.45; // servo percent
}
