// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** A class containing constant values (ie values accociated to the field or specific motors). */
public class Constants {
    /**
     * Contains constants for Linear Actuator found here: https://www.andymark.com/products/actuator-l16-r-50mm-stroke-150-1-6v
     * 
     * Source: https://andymark-weblinc.netdna-ssl.com/media/W1siZiIsIjIwMTkvMDMvMjIvMTAvMjkvNDEvYWViNDNlZDgtMWM3NC00NGY5LWIwMGMtNmRlNjE4Y2ExNjU5L1VzaW5nIEwxNiBMaW5lYXIgU2Vydm8gMDMtMjAxOS5wZGYiXV0/Using%20L16%20Linear%20Servo%2003-2019.pdf?sha=44e08f353d4bb9ec 
     */
    public class LinearActuator
    {
        /** The max PWM pulse width in ms */
        public static final double max = 2.0;
        /** The high end of the deadband range pulse width in ms */
        public static final double deadbandMax = 1.8;
        /** The center (off) pulse width in ms */
        public static final double center = 1.5;
        /** The low end of the deadband pulse width in ms */
        public static final double deadbandMin = 1.2;
        /** The minimum pulse width in ms */
        public static final double min = 1.0;

        /** usage: yourActuator.setSpeed(1.0); // to open */
        public static final double COMMAND_EXTEND = 1.0;
        /** usage: yourActuator.setSpeed(-1.0); // to close */
        public static final double COMMAND_RETRACT = -1.0;
    }
}
