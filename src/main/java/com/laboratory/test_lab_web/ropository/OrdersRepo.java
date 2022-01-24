package com.laboratory.test_lab_web.ropository;

import com.laboratory.test_lab_web.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository<Orders, Long> {

}
