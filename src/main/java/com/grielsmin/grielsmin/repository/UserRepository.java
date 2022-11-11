package com.grielsmin.grielsmin.repository;

import com.grielsmin.grielsmin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

        User findByLogin(String login);

        User findUserById(Long UserId);

        User findUserByName(String name);

}
