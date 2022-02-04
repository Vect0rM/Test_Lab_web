package com.laboratory.test_lab_web.ropository;

import com.laboratory.test_lab_web.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
