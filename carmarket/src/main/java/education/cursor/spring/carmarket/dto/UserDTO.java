package education.cursor.spring.carmarket.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserDTO {
    @NotNull(message = "First name can not be NULL")
    @Size(min = 1, max = 50, message = "not less 1 or 50 chars either")
    private String firstName;
    @NotNull(message = "Last name can not be NULL")
    @Size(min = 1, max = 50, message = "not less 1 or 50 chars either")
    private String lastName;
    @NotNull(message = "Phone number can not be NULL")
    @Size(min = 1, max = 13, message = "not less 1 or 50 chars either")
    private Long mobilePhone;
}
