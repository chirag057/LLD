package StrategyPattern.With;

import StrategyPattern.With.Stratergy.DriveStratergy;

public class Vehicle  {

    DriveStratergy driverObject;


    // This is a Constructor Injection
    Vehicle(DriveStratergy driverObject)
    {
        this.driverObject = driverObject;
    }

    public void drive()
    {
        this.driverObject.drive();
    }
}
