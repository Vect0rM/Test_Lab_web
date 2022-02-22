package com.laboratory.test_lab_web.ropository;

import com.laboratory.test_lab_web.models.Offers;
import com.laboratory.test_lab_web.models.User;
import org.springframework.data.repository.CrudRepository;

public interface OffersRepo extends CrudRepository<Offers, Long> {
}
