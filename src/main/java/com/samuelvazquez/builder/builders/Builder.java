package com.samuelvazquez.builder.builders;

import com.samuelvazquez.builder.cars.CarType;
import com.samuelvazquez.builder.components.Engine;
import com.samuelvazquez.builder.components.GPSNavigator;
import com.samuelvazquez.builder.components.Transmission;
import com.samuelvazquez.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product
 */
public interface Builder {
        void setCarType(CarType type);
        void setSeats(int seats);
        void setEngine(Engine engine);
        void setTransmission(Transmission transmission);
        void setTripComputer(TripComputer tripComputer);
        void setGPSNavigator(GPSNavigator gpsNavigator);
    }

