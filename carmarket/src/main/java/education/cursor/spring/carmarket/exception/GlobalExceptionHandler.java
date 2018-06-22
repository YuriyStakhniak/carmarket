package education.cursor.spring.carmarket.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("education.cursor.spring.carmarket.controller.CarController")
public class GlobalExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseMsg handleCarNotFoundException(CarNotFoundException e) {
        ResponseMsg msg = new ResponseMsg(e.getMessage());
        return msg;
    }
}
