package com.finastra.java8springbooth2maven.repository;

import com.finastra.java8springbooth2maven.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
