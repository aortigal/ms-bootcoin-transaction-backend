package com.bank.msbootcointransactionbackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"kafka.bootstrapAddress=localhost",
		"kafka.topic.transaction=bootcoin-transaction-topic"
})
class MsBootcoinTransactionBackendApplicationTests {

	@Test
	void contextLoads() {
	}

}
