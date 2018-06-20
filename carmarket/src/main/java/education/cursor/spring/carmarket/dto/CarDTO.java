package education.cursor.spring.carmarket.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CarDTO {

    @NotNull(message = "brand can not be NULL")
    @Size(min = 1, max = 50, message = "not less 1 or 50 chars either")
    private String carBrand;
    @NotNull(message = "model can not be NULL")
    @Size(min = 1, max = 50, message = "not less 1 or 50 chars either")
    private String carModel;
    @NotNull(message = "type can not be NULL")
    @Size(min = 1, max = 50, message = "not less 1 or 50 chars either")
    private String carType;
    @NotNull(message = "year can not be NULL")
    private Integer year;
    @NotNull(message = "name can not be NULL")
    private Double price;
}
