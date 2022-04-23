/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.robot;

// RomiBase 
import xyz.zagdrath.robot.commands.*;
import xyz.zagdrath.robot.subsystems.*;

/**
 * This class provides all of the subsystems, commands and sensors for the
 * robot.
 * 
 * @author Cody Wellman (zagdrath@member.fsf.org)
 */
public class RobotContainer {

    // Subsystems
    private final DrivetrainSubsystem drivetrainSubsystem = new DrivetrainSubsystem();

    // Commands
    private final DrivetrainCommand drivetrainCommand = new DrivetrainCommand();

    public OI operatorInterface;

    public RobotContainer() {
        configureDefaultCommands();
        configureButtonBindings();
    }

    /** Configuration for all of the default commands should go here. */
    private void configureDefaultCommands() {
    }

    /** Configuration for all of the button bindings should go here. */
    private void configureButtonBindings() {
    }

}
