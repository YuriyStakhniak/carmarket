package education.cursor.spring.carmarket.service;

import education.cursor.spring.carmarket.dto.CarDTO;
import education.cursor.spring.carmarket.model.Car;

import java.util.List;
import java.util.stream.Stream;

public interface ICarService {

    void saveNewCar(CarDTO dto);

    Stream<Car> getAllCarsStream();

    Car getCarById(Long beerId);

    List<Car> getSortedCarsByYear();

    List<Car> getSortedCarsByPrice();

}
