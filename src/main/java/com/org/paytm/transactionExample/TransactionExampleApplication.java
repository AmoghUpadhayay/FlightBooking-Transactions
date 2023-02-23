package com.org.paytm.transactionExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionExampleApplication.class, args);
	}

}
