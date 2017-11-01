package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Joseph Pancho on 11/1/2017.
 */
@TeleOp(name = "Main Teleop", group = "stuff")
public class MainTeleop extends OpMode {

    DcMotor left, right, lift;
    Servo liftLeft, liftRight;


    @Override
    public void init(){

        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");
        lift = hardwareMap.dcMotor.get("lift");

        liftLeft = hardwareMap.servo.get("liftLeft");
        liftRight = hardwareMap.servo.get("liftRight");
    }

    @Override
    public void loop() {
        left.setPower(gamepad1.left_stick_y);
        left.setPower(gamepad1.right_stick_y);

        lift.setPower(gamepad2.right_stick_y);


    }
}
