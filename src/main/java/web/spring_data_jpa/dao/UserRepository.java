package web.spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.spring_data_jpa.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findAllByName(String name);
}
