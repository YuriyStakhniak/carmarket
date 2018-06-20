package education.cursor.spring.carmarket.repository;

import education.cursor.spring.carmarket.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value = "select * from cars", nativeQuery = true)
    Stream<Car> getAll();

    Car getCarById (Long id);

    @Query(value = "select * from cars ORDER BY year", nativeQuery = true)
    List<Car> getAllCarsSortedByYear();

    @Query(value = "select * from cars ORDER BY price", nativeQuery = true)
    List<Car> getAllCarsSortedByPrice();


}
