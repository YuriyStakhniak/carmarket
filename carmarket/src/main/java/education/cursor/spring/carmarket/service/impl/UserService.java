package education.cursor.spring.carmarket.service.impl;

import education.cursor.spring.carmarket.dto.UserDTO;
import education.cursor.spring.carmarket.exception.UserNotFoundException;
import education.cursor.spring.carmarket.model.User;
import education.cursor.spring.carmarket.repository.UserRepository;
import education.cursor.spring.carmarket.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    private final UserRepository repository;

    @Override
    public void saveNewUser(UserDTO dto) {
        repository.save(User.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .mobilePhone(dto.getMobilePhone())
                .build());
    }

    @Override
    public User getUserById(Long userId) {
        return repository.findById(userId)
                .orElseThrow(()-> new UserNotFoundException("User " + userId + " not found"));
    }
}
