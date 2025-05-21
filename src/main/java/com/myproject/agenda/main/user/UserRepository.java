package com.myproject.agenda.main.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    User findByLogin(String subject);

    boolean existsByLogin(String login);
}
