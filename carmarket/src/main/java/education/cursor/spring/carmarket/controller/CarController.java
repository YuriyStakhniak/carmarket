package education.cursor.spring.carmarket.controller;

import education.cursor.spring.carmarket.dto.CarDTO;
import education.cursor.spring.carmarket.dto.Response;
import education.cursor.spring.carmarket.service.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.stream.Collectors;

@Validated
@RestController
@RequestMapping("cars")
@RequiredArgsConstructor
public class CarController {

    private final ICarService service;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public Response submitNewCar(@RequestBody @NotNull @Valid CarDTO carDTO){
        service.saveNewCar(carDTO);
        return Response.builder()
                .message("car was saved")
                .info(Collections.singletonMap("SomeValue", 13))
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    @Transactional(readOnly = true)
    public Response getAllCars(){
        return Response.builder()
                .message("You.ve got all cars from DB")
                .info(Collections.singletonMap("cars", service.getAllCarsStream()
                        .collect(Collectors.toList())))
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Response getCarById(@PathVariable("id") Long id){
        return Response.builder()
                .message(String.format("Founded car by id", id))
                .info(Collections.singletonMap("car", service.getCarById(id)))
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("sorted_by_year")
    public Response getCarsSortedByYear(){
        return Response.builder()
                .message("Sorted cars by year")
                .info(Collections.singletonMap("cars", service.getSortedCarsByYear()))
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("sorted_by_price")
    public Response getCarsSortedByPrice(){
        return Response.builder()
                .message("Sorted cars by price")
                .info(Collections.singletonMap("cars", service.getSortedCarsByPrice()))
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public Response deleteCar(@PathVariable("id") Long id){
        service.delete(id);
        return Response.builder()
                .message(String.format("deleted car by id", id))
                .info(Collections.singletonMap("SomeValue", 13))
                .build();
    }
}
