package web.spring_data_jpa.service;

;

import web.spring_data_jpa.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

    public List<User> findAllByName(String name);
}
