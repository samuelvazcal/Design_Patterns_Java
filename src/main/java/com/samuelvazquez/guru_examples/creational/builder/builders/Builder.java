package com.samuelvazquez.guru_examples.creational.builder.builders;

import com.samuelvazquez.guru_examples.creational.builder.cars.CarType;
import com.samuelvazquez.guru_examples.creational.builder.components.Engine;
import com.samuelvazquez.guru_examples.creational.builder.components.GPSNavigator;
import com.samuelvazquez.guru_examples.creational.builder.components.Transmission;
import com.samuelvazquez.guru_examples.creational.builder.components.TripComputer;

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

