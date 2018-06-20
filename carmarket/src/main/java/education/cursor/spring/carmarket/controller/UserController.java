package education.cursor.spring.carmarket.controller;

import education.cursor.spring.carmarket.dto.Response;
import education.cursor.spring.carmarket.dto.UserDTO;
import education.cursor.spring.carmarket.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collections;

@Validated
@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService service;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public Response submitNewUser(@RequestBody @NotNull @Valid UserDTO userDTO) {
        service.saveNewUser(userDTO);
        return Response.builder()
                .message("user was saved")
                .info(Collections.singletonMap("SomeValue", 13))
                .build();
    }
}
