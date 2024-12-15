package StrategyPattern.With;

import StrategyPattern.With.Stratergy.NormalDriveStratergy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle()
    {
        super(new NormalDriveStratergy());
    }
}
