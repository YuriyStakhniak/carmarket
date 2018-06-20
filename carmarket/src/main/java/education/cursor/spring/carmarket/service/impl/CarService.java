package education.cursor.spring.carmarket.service.impl;

import education.cursor.spring.carmarket.dto.CarDTO;
import education.cursor.spring.carmarket.exception.CarNotFoundException;
import education.cursor.spring.carmarket.model.Car;
import education.cursor.spring.carmarket.repository.CarRepository;
import education.cursor.spring.carmarket.service.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class CarService implements ICarService {

    private final CarRepository repository;

    @Override
    public void saveNewCar(CarDTO dto) {
        repository.save(Car.builder()
                .carBrand(dto.getCarBrand())
                .carModel(dto.getCarModel())
                .carType(dto.getCarType())
                .year(dto.getYear())
                .price(dto.getPrice())
                .build());
    }

    @Override
    public Stream<Car> getAllCarsStream() {
        return repository.getAll();
    }

    @Override
    public Car getCarById(Long carId) {
        return repository.findById(carId).orElseThrow(() -> new CarNotFoundException("Car not found"));
    }

    @Override
    public List<Car> getSortedCarsByYear() {
        return repository.getAllCarsSortedByYear();
    }

    @Override
    public List<Car> getSortedCarsByPrice() {
        return repository.getAllCarsSortedByPrice();
    }
}
