package frc.robot.commands.skipper;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Skipper;

public class SkipShooter extends Command{
    Skipper skipper;

    public SkipShooter(Skipper skipper) {
        this.skipper = skipper;
        addRequirements(skipper);
    }

    @Override
    public void execute() {
        skipper.setSkipperVelo(0.8); 
    }

    @Override
    public void end(boolean interrupted) {
        skipper.setSkipperVelo(0.0);
    }
}
