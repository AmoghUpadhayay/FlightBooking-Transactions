package com.org.paytm.transactionExample.repository;

import com.org.paytm.transactionExample.model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<PassengerInfo, Long> {
}
