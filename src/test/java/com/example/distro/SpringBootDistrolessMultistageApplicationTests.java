package com.example.distro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDistrolessMultistageApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(1, 1, "not equals");
	}

}
