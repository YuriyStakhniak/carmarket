package education.cursor.spring.carmarket.service;

import education.cursor.spring.carmarket.model.User;

public interface IUserService {

    String signin(String username, String password);
    String signup(User user);
    User search(String username);


}
