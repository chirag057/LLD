package StrategyPattern.With;

import StrategyPattern.With.Stratergy.SportsDriveStratergy;

public class SportsVehicle extends Vehicle {

    SportsVehicle()
    {
        super(new SportsDriveStratergy());
    }
}
