package StrategyPattern.With;

import StrategyPattern.With.Stratergy.SportsDriveStratergy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle()
    {
        super(new SportsDriveStratergy());
    }
}
