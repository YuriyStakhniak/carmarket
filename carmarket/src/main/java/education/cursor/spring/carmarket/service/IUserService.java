package education.cursor.spring.carmarket.service;

import education.cursor.spring.carmarket.dto.UserDTO;
import education.cursor.spring.carmarket.model.User;

public interface IUserService {
    void saveNewUser(UserDTO dto);
    User getUserById(Long userId);
}
