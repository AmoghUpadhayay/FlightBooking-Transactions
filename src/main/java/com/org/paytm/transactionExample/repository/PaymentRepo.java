package com.org.paytm.transactionExample.repository;

import com.org.paytm.transactionExample.model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentInfo, String> {
}
