package com.laboratory.test_lab_web.ropository;

import com.laboratory.test_lab_web.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<Users, Long> {

}
