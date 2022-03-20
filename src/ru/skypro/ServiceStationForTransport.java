package ru.skypro;

public interface ServiceStationForTransport {
    void check(Car car);

    void check(Truck truck);

    void check(Bicycle bicycle);
}
