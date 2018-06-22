package education.cursor.spring.carmarket.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserResponseDTO {

    @ApiModelProperty(position = 0)
    private Integer id;
    @ApiModelProperty(position = 1)
    private String username;
    @ApiModelProperty(position = 2)
    private String email;
    @ApiModelProperty(position = 3)
    private String firstName;
    @ApiModelProperty(position = 4)
    private String lastName;
    @ApiModelProperty(position = 5)
    private Long mobilePhone;
}
