package com.laboratory.test_lab_web.ropository;

import com.laboratory.test_lab_web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
