package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Joseph Pancho on 11/1/2017.
 */
@Autonomous(name = "Main Autonomous", group = "stuff")
public class MainAuton extends LinearOpMode{

    DcMotor left, right;

    public void runOpMode(){

        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");

        waitForStart();
    }
}
